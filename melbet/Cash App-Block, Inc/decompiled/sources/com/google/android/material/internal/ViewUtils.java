package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.core.instancing.TextureArray$uploadInternal$1;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public abstract class ViewUtils {
    public static final int[] APPCOMPAT_CHECK_ATTRS = {R.attr.colorPrimary};
    public static final int[] MATERIAL_CHECK_ATTRS = {R.attr.colorPrimaryVariant};
    public static final ViewPager.AnonymousClass1 VIEW_TOP_COMPARATOR = new ViewPager.AnonymousClass1(28);

    /* renamed from: com.google.android.material.internal.ViewUtils$3, reason: invalid class name */
    public final class AnonymousClass3 implements View.OnAttachStateChangeListener {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass3(int i) {
            this.$r8$classId = i;
        }

        private final void onViewDetachedFromWindow$com$google$android$material$internal$ViewUtils$3(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            switch (this.$r8$classId) {
                case 0:
                    view.removeOnAttachStateChangeListener(this);
                    view.requestApplyInsets();
                    break;
                default:
                    view.getClass();
                    view.removeOnAttachStateChangeListener(this);
                    view.requestApplyInsets();
                    break;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    view.getClass();
                    break;
            }
        }
    }

    public interface OnApplyWindowInsetsListener {
        WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding);
    }

    /* loaded from: classes6.dex */
    public final class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public void bind(int i) {
            if (this.start != 0) {
                GLES20.glActiveTexture(i + 33984);
                GLES20.glBindTexture(35866, this.start);
            } else {
                Timber.Forest.w(Recorder$$ExternalSyntheticOutline2.m(this.end, this.bottom, "x", Recorder$$ExternalSyntheticOutline2.m107m(i, this.top, "bind(", ") called but textureId is 0! Array has ", " layers, ")), new Object[0]);
            }
        }

        public void dispose() {
            int i = this.start;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                this.start = 0;
            }
            this.top = 0;
        }

        public String getDescription() {
            return this.end + "x" + this.bottom + " x " + this.top + " layers";
        }

        public long getGpuMemoryBytes() {
            return this.end * this.bottom * 4 * this.top;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x019b, code lost:
        
            if (kotlinx.coroutines.JobKt.yield(r3) == r4) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x019d, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:
        
            if (r2 == r4) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0188 -> B:11:0x019e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x019b -> B:11:0x019e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object uploadInternal(List list, int i, ContinuationImpl continuationImpl) {
            TextureArray$uploadInternal$1 textureArray$uploadInternal$1;
            int i2;
            int i3;
            int i4;
            List list2;
            int i5;
            int i6;
            Iterator it;
            List list3 = list;
            if (continuationImpl instanceof TextureArray$uploadInternal$1) {
                textureArray$uploadInternal$1 = (TextureArray$uploadInternal$1) continuationImpl;
                int i7 = textureArray$uploadInternal$1.label;
                if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                    textureArray$uploadInternal$1.label = i7 - PKIFailureInfo.systemUnavail;
                    Object obj = textureArray$uploadInternal$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = textureArray$uploadInternal$1.label;
                    Continuation continuation = null;
                    if (i2 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (list3.isEmpty()) {
                            Timber.Forest.e("Cannot create texture array with 0 bitmaps", new Object[0]);
                            return Boolean.FALSE;
                        }
                        List list4 = list3;
                        Iterator it2 = list4.iterator();
                        if (!it2.hasNext()) {
                            a$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        int width = ((Bitmap) it2.next()).getWidth();
                        while (it2.hasNext()) {
                            int width2 = ((Bitmap) it2.next()).getWidth();
                            if (width < width2) {
                                width = width2;
                            }
                        }
                        this.end = width;
                        Iterator it3 = list4.iterator();
                        if (!it3.hasNext()) {
                            a$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        int height = ((Bitmap) it3.next()).getHeight();
                        while (it3.hasNext()) {
                            int height2 = ((Bitmap) it3.next()).getHeight();
                            if (height < height2) {
                                height = height2;
                            }
                        }
                        this.bottom = height;
                        int size = list3.size();
                        this.top = size;
                        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(size, " layers", Recorder$$ExternalSyntheticOutline2.m107m(this.end, this.bottom, "Using max dimensions: ", "x", " for ")), new Object[0]);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2(list3, this, continuation, 3);
                        textureArray$uploadInternal$1.L$0 = list3;
                        i3 = i;
                        textureArray$uploadInternal$1.I$0 = i3;
                        textureArray$uploadInternal$1.label = 1;
                        obj = JobKt.withContext(defaultIoScheduler, realAppConfigManager$update$2$2, textureArray$uploadInternal$1);
                    } else if (i2 == 1) {
                        int i8 = textureArray$uploadInternal$1.I$0;
                        List list5 = textureArray$uploadInternal$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        i3 = i8;
                        list3 = list5;
                    } else {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i9 = textureArray$uploadInternal$1.I$1;
                        i5 = textureArray$uploadInternal$1.I$0;
                        it = textureArray$uploadInternal$1.L$3;
                        list2 = textureArray$uploadInternal$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        i6 = i9;
                        if (!it.hasNext()) {
                            i9 = i6 + 1;
                            ByteBuffer byteBuffer = (ByteBuffer) it.next();
                            GLES20.glBindTexture(35866, this.start);
                            GLES30.glTexSubImage3D(35866, 0, 0, 0, i6, this.end, this.bottom, 1, 6408, 5121, byteBuffer);
                            if (i6 < list2.size() - 1) {
                                textureArray$uploadInternal$1.L$0 = list2;
                                textureArray$uploadInternal$1.L$3 = it;
                                textureArray$uploadInternal$1.I$0 = i5;
                                textureArray$uploadInternal$1.I$1 = i9;
                                textureArray$uploadInternal$1.label = 2;
                            }
                            i6 = i9;
                            if (!it.hasNext()) {
                                GLES20.glBindTexture(35866, 0);
                                GLES20.glFlush();
                                int glGetError = GLES20.glGetError();
                                if (glGetError != 0) {
                                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(glGetError, "GL error after texture array upload: "), new Object[0]);
                                }
                                Timber.Forest.d(Recorder$$ExternalSyntheticOutline1.m(this.top, this.start, " layers (textureId=", ")", Recorder$$ExternalSyntheticOutline2.m107m(this.end, this.bottom, "Created texture array: ", "x", " x ")), new Object[0]);
                                return Boolean.TRUE;
                            }
                        }
                    }
                    List list6 = (List) obj;
                    i4 = this.start;
                    if (i4 != 0) {
                        GLES20.glDeleteTextures(1, new int[]{i4}, 0);
                    }
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    int i10 = iArr[0];
                    this.start = i10;
                    GLES20.glBindTexture(35866, i10);
                    GLES20.glTexParameteri(35866, 10241, 9729);
                    GLES20.glTexParameteri(35866, 10240, 9729);
                    GLES20.glTexParameteri(35866, 10242, i3);
                    GLES20.glTexParameteri(35866, 10243, i3);
                    GLES30.glTexImage3D(35866, 0, 32856, this.end, this.bottom, this.top, 0, 6408, 5121, (Buffer) null);
                    list2 = list3;
                    i5 = i3;
                    i6 = 0;
                    it = list6.iterator();
                    if (!it.hasNext()) {
                    }
                }
            }
            textureArray$uploadInternal$1 = new TextureArray$uploadInternal$1(this, continuationImpl);
            Object obj2 = textureArray$uploadInternal$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = textureArray$uploadInternal$1.label;
            Continuation continuation2 = null;
            if (i2 != 0) {
            }
            List list62 = (List) obj2;
            i4 = this.start;
            if (i4 != 0) {
            }
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            int i102 = iArr2[0];
            this.start = i102;
            GLES20.glBindTexture(35866, i102);
            GLES20.glTexParameteri(35866, 10241, 9729);
            GLES20.glTexParameteri(35866, 10240, 9729);
            GLES20.glTexParameteri(35866, 10242, i3);
            GLES20.glTexParameteri(35866, 10243, i3);
            GLES30.glTexImage3D(35866, 0, 32856, this.end, this.bottom, this.top, 0, 6408, 5121, (Buffer) null);
            list2 = list3;
            i5 = i3;
            i6 = 0;
            it = list62.iterator();
            if (!it.hasNext()) {
            }
        }
    }

    public static void calculateFadeOutAndInAlphas(float f, float[] fArr) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f * 2.0f) - 1.0f;
        }
    }

    public static Rect calculateOffsetRectFromBounds(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static void checkCompatibleTheme(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkTheme(context, MATERIAL_CHECK_ATTRS, "Theme.MaterialComponents");
            }
        }
        checkTheme(context, APPCOMPAT_CHECK_ATTRS, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void checkTextAppearance(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ThemeEnforcement, i, i2);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
            obtainStyledAttributes.recycle();
            if (z) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void checkTheme(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static void doOnApplyWindowInsets(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        RelativePadding relativePadding = new RelativePadding();
        relativePadding.start = paddingStart;
        relativePadding.top = paddingTop;
        relativePadding.end = paddingEnd;
        relativePadding.bottom = paddingBottom;
        BinaryBitmap binaryBitmap = new BinaryBitmap(1, onApplyWindowInsetsListener, relativePadding);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, binaryBitmap);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new AnonymousClass3(0));
        }
    }

    public static float dpToPx(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static ActionMenuView getActionMenuView(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static ImageButton getNavigationIconButton(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList getTextViewsWithText(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean isLayoutRtl(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static TypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i, i2);
        checkTextAppearance(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
