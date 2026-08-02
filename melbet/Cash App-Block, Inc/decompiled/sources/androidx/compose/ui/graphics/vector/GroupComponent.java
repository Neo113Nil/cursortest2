package androidx.compose.ui.graphics.vector;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import coil3.Extras;
import com.squareup.wire.GrpcMethod;
import curtains.WindowsKt$onNextDraw$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class GroupComponent extends VNode {
    public AndroidPath clipPath;
    public float[] groupMatrix;
    public Function1 invalidateListener;
    public float pivotX;
    public float pivotY;
    public float rotation;
    public float translationX;
    public float translationY;
    public final ArrayList children = new ArrayList();
    public boolean isTintable = true;
    public long tintColor = Color.Unspecified;
    public List clipPathData = VectorKt.EmptyPath;
    public boolean isClipPathDirty = true;
    public final WindowsKt$onNextDraw$1 wrappedListener = new WindowsKt$onNextDraw$1(this, 4);
    public String name = "";
    public float scaleX = 1.0f;
    public float scaleY = 1.0f;
    public boolean isMatrixDirty = true;

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void draw(DrawScope drawScope) {
        if (this.isMatrixDirty) {
            float[] fArr = this.groupMatrix;
            if (fArr == null) {
                fArr = Matrix.m699constructorimpl$default();
                this.groupMatrix = fArr;
            } else {
                Matrix.m702resetimpl(fArr);
            }
            Matrix.m705translateimpl(fArr, this.translationX + this.pivotX, this.translationY + this.pivotY);
            Matrix.m703rotateZimpl(this.rotation, fArr);
            float f = this.scaleX;
            float f2 = this.scaleY;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f;
                fArr[1] = fArr[1] * f;
                fArr[2] = fArr[2] * f;
                fArr[3] = fArr[3] * f;
                fArr[4] = fArr[4] * f2;
                fArr[5] = fArr[5] * f2;
                fArr[6] = fArr[6] * f2;
                fArr[7] = fArr[7] * f2;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            Matrix.m705translateimpl(fArr, -this.pivotX, -this.pivotY);
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            if (!this.clipPathData.isEmpty()) {
                AndroidPath androidPath = this.clipPath;
                if (androidPath == null) {
                    androidPath = AndroidPath_androidKt.Path();
                    this.clipPath = androidPath;
                }
                PathParserKt.toPath(this.clipPathData, androidPath);
            }
            this.isClipPathDirty = false;
        }
        GrpcMethod drawContext = drawScope.getDrawContext();
        long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            Extras.Key key = (Extras.Key) drawContext.path;
            float[] fArr2 = this.groupMatrix;
            if (fArr2 != null) {
                ((GrpcMethod) key.f61default).getCanvas().mo649concat58bKbWc(fArr2);
            }
            AndroidPath androidPath2 = this.clipPath;
            if (!this.clipPathData.isEmpty() && androidPath2 != null) {
                key.m1434clipPathmtrdDE(androidPath2, 1);
            }
            ArrayList arrayList = this.children;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((VNode) arrayList.get(i)).draw(drawScope);
            }
            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
        } catch (Throwable th) {
            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final Function1 getInvalidateListener$ui() {
        return this.invalidateListener;
    }

    public final void insertAt(int i, VNode vNode) {
        ArrayList arrayList = this.children;
        if (i < arrayList.size()) {
            arrayList.set(i, vNode);
        } else {
            arrayList.add(vNode);
        }
        markTintForVNode(vNode);
        vNode.setInvalidateListener$ui(this.wrappedListener);
        invalidate();
    }

    /* renamed from: markTintForColor-8_81llA, reason: not valid java name */
    public final void m765markTintForColor8_81llA(long j) {
        if (this.isTintable && j != 16) {
            long j2 = this.tintColor;
            if (j2 == 16) {
                this.tintColor = j;
                return;
            }
            EmptyList emptyList = VectorKt.EmptyPath;
            if (Color.m681getRedimpl(j2) == Color.m681getRedimpl(j) && Color.m680getGreenimpl(j2) == Color.m680getGreenimpl(j) && Color.m678getBlueimpl(j2) == Color.m678getBlueimpl(j)) {
                return;
            }
            this.isTintable = false;
            this.tintColor = Color.Unspecified;
        }
    }

    public final void markTintForVNode(VNode vNode) {
        if (!(vNode instanceof PathComponent)) {
            if (vNode instanceof GroupComponent) {
                GroupComponent groupComponent = (GroupComponent) vNode;
                if (groupComponent.isTintable && this.isTintable) {
                    m765markTintForColor8_81llA(groupComponent.tintColor);
                    return;
                } else {
                    this.isTintable = false;
                    this.tintColor = Color.Unspecified;
                    return;
                }
            }
            return;
        }
        PathComponent pathComponent = (PathComponent) vNode;
        Brush brush = pathComponent.fill;
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m765markTintForColor8_81llA(((SolidColor) brush).value);
            } else {
                this.isTintable = false;
                this.tintColor = Color.Unspecified;
            }
        }
        Brush brush2 = pathComponent.stroke;
        if (this.isTintable && brush2 != null) {
            if (brush2 instanceof SolidColor) {
                m765markTintForColor8_81llA(((SolidColor) brush2).value);
            } else {
                this.isTintable = false;
                this.tintColor = Color.Unspecified;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void setInvalidateListener$ui(WindowsKt$onNextDraw$1 windowsKt$onNextDraw$1) {
        this.invalidateListener = windowsKt$onNextDraw$1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.name);
        ArrayList arrayList = this.children;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            VNode vNode = (VNode) arrayList.get(i);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
