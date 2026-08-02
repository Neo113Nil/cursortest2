package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ShaderBrush extends Brush {
    public long createdSize = 9205357640488583168L;
    public Toolbar.AnonymousClass1 internalTransformShader;

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo670applyToPq9zytI(float f, long j, Paint paint) {
        Toolbar.AnonymousClass1 anonymousClass1 = this.internalTransformShader;
        if (anonymousClass1 == null || !Size.m639equalsimpl0(this.createdSize, j)) {
            if (Size.m644isEmptyimpl(j)) {
                this.internalTransformShader = null;
                this.createdSize = 9205357640488583168L;
                anonymousClass1 = null;
            } else {
                anonymousClass1 = this.internalTransformShader;
                if (anonymousClass1 == null) {
                    anonymousClass1 = new Toolbar.AnonymousClass1();
                    this.internalTransformShader = anonymousClass1;
                }
                anonymousClass1.this$0 = mo671createShaderuvyYCjk(j);
                this.internalTransformShader = anonymousClass1;
                this.createdSize = j;
            }
        }
        AndroidPaint androidPaint = (AndroidPaint) paint;
        long Color = ColorKt.Color(androidPaint.internalPaint.getColor());
        long j2 = Color.Black;
        if (!Color.m676equalsimpl0(Color, j2)) {
            androidPaint.m659setColor8_81llA(j2);
        }
        if (!Intrinsics.areEqual(androidPaint.internalShader, anonymousClass1 != null ? (Shader) anonymousClass1.this$0 : null)) {
            androidPaint.setShader(anonymousClass1 != null ? (Shader) anonymousClass1.this$0 : null);
        }
        if (r4.getAlpha() / 255.0f == f) {
            return;
        }
        androidPaint.setAlpha(f);
    }

    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo671createShaderuvyYCjk(long j);
}
