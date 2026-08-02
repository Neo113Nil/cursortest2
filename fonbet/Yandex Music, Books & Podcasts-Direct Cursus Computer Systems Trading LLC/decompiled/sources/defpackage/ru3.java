package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ru3 extends View implements xpr {
    public final ArrayList a;
    public List b;
    public float c;
    public uu3 d;
    public float e;

    public ru3(Context context, int i) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
        this.d = uu3.g;
        this.e = 0.08f;
    }

    @Override // defpackage.xpr
    public final void a(List list, uu3 uu3Var, float f, float f2) {
        this.b = list;
        this.d = uu3Var;
        this.c = f;
        this.e = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new rpr(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0464  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        float f2;
        int i5;
        float f3;
        TextPaint textPaint;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ru3 ru3Var = this;
        List list = ru3Var.b;
        if (list.isEmpty()) {
            return;
        }
        int height = ru3Var.getHeight();
        int paddingLeft = ru3Var.getPaddingLeft();
        int paddingTop = ru3Var.getPaddingTop();
        int width = ru3Var.getWidth() - ru3Var.getPaddingRight();
        int paddingBottom = height - ru3Var.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i11 = paddingBottom - paddingTop;
        float X = y1g.X(0, height, i11, ru3Var.c);
        float f4 = 0.0f;
        if (X <= 0.0f) {
            return;
        }
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            rv6 rv6Var = (rv6) list.get(i12);
            float f5 = f4;
            if (rv6Var.p != Integer.MIN_VALUE) {
                qv6 a = rv6Var.a();
                a.h = -3.4028235E38f;
                a.i = Integer.MIN_VALUE;
                a.c = null;
                int i13 = rv6Var.f;
                float f6 = rv6Var.e;
                if (i13 == 0) {
                    a.e = 1.0f - f6;
                    i10 = 0;
                    a.f = 0;
                } else {
                    i10 = 0;
                    a.e = (-f6) - 1.0f;
                    a.f = 1;
                }
                int i14 = rv6Var.g;
                if (i14 == 0) {
                    a.g = 2;
                } else if (i14 == 2) {
                    a.g = i10;
                }
                rv6Var = a.a();
            }
            float X2 = y1g.X(rv6Var.n, height, i11, rv6Var.o);
            rpr rprVar = (rpr) ru3Var.a.get(i12);
            uu3 uu3Var = ru3Var.d;
            List list2 = list;
            float f7 = ru3Var.e;
            TextPaint textPaint2 = rprVar.f;
            int i15 = height;
            Bitmap bitmap = rv6Var.d;
            int i16 = i11;
            float f8 = rv6Var.k;
            int i17 = size;
            float f9 = rv6Var.j;
            int i18 = i12;
            int i19 = rv6Var.i;
            float f10 = rv6Var.h;
            int i20 = rv6Var.g;
            float f11 = X;
            int i21 = rv6Var.f;
            float f12 = rv6Var.e;
            Layout.Alignment alignment = rv6Var.b;
            CharSequence charSequence = rv6Var.a;
            boolean z2 = bitmap == null;
            if (z2) {
                if (!TextUtils.isEmpty(charSequence)) {
                    f = f10;
                    i = rv6Var.l ? rv6Var.m : uu3Var.c;
                }
                i3 = paddingLeft;
                i4 = paddingTop;
                z = false;
                i12 = i18 + 1;
                ru3Var = this;
                f4 = f5;
                list = list2;
                height = i15;
                i11 = i16;
                size = i17;
                X = f11;
                paddingLeft = i3;
                paddingTop = i4;
            } else {
                f = f10;
                i = -16777216;
            }
            CharSequence charSequence2 = rprVar.i;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Objects.equals(rprVar.j, alignment) && rprVar.k == bitmap && rprVar.l == f12 && rprVar.m == i21) {
                i2 = i20;
                if (Integer.valueOf(rprVar.n).equals(Integer.valueOf(i2)) && rprVar.o == f && Integer.valueOf(rprVar.p).equals(Integer.valueOf(i19)) && rprVar.q == f9 && rprVar.r == f8 && rprVar.s == uu3Var.a && rprVar.t == uu3Var.b && rprVar.u == i && rprVar.w == uu3Var.d && rprVar.v == uu3Var.e && Objects.equals(textPaint2.getTypeface(), uu3Var.f) && rprVar.x == f11 && rprVar.y == X2 && rprVar.z == f7 && rprVar.A == paddingLeft && rprVar.B == paddingTop && rprVar.C == width && rprVar.D == paddingBottom) {
                    rprVar.a(canvas, z2);
                    i3 = paddingLeft;
                    i4 = paddingTop;
                    z = false;
                    i12 = i18 + 1;
                    ru3Var = this;
                    f4 = f5;
                    list = list2;
                    height = i15;
                    i11 = i16;
                    size = i17;
                    X = f11;
                    paddingLeft = i3;
                    paddingTop = i4;
                }
            } else {
                i2 = i20;
            }
            rprVar.i = charSequence;
            rprVar.j = alignment;
            rprVar.k = bitmap;
            rprVar.l = f12;
            rprVar.m = i21;
            rprVar.n = i2;
            rprVar.o = f;
            rprVar.p = i19;
            rprVar.q = f9;
            rprVar.r = f8;
            rprVar.s = uu3Var.a;
            rprVar.t = uu3Var.b;
            rprVar.u = i;
            rprVar.w = uu3Var.d;
            rprVar.v = uu3Var.e;
            textPaint2.setTypeface(uu3Var.f);
            rprVar.x = f11;
            rprVar.y = X2;
            rprVar.z = f7;
            rprVar.A = paddingLeft;
            rprVar.B = paddingTop;
            rprVar.C = width;
            rprVar.D = paddingBottom;
            if (z2) {
                rprVar.i.getClass();
                CharSequence charSequence3 = rprVar.i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(rprVar.i);
                int i22 = rprVar.C - rprVar.A;
                int i23 = rprVar.D - rprVar.B;
                textPaint2.setTextSize(rprVar.x);
                int i24 = (int) ((rprVar.x * 0.125f) + 0.5f);
                int i25 = i24 * 2;
                int i26 = i22 - i25;
                float f13 = rprVar.q;
                if (f13 != -3.4028235E38f) {
                    i26 = (int) (i26 * f13);
                }
                int i27 = i26;
                if (i27 <= 0) {
                    vq1.n0("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f11 = f11;
                    i3 = paddingLeft;
                    i4 = paddingTop;
                } else {
                    f11 = f11;
                    if (rprVar.y > f5) {
                        textPaint = textPaint2;
                        i3 = paddingLeft;
                        i6 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) rprVar.y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        textPaint = textPaint2;
                        i3 = paddingLeft;
                        i6 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (rprVar.w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i6, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i28 = 0;
                        for (int length = foregroundColorSpanArr.length; i28 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i28]);
                            i28++;
                        }
                    }
                    if (Color.alpha(rprVar.t) > 0) {
                        int i29 = rprVar.w;
                        if (i29 == 0 || i29 == 2) {
                            i4 = paddingTop;
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(rprVar.t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            i4 = paddingTop;
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(rprVar.t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    } else {
                        i4 = paddingTop;
                    }
                    Layout.Alignment alignment2 = rprVar.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, textPaint, i27, alignment3, rprVar.d, rprVar.e, true);
                    rprVar.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = rprVar.E.getLineCount();
                    int i30 = 0;
                    int i31 = 0;
                    while (i30 < lineCount) {
                        i31 = Math.max((int) Math.ceil(rprVar.E.getLineWidth(i30)), i31);
                        i30++;
                        height2 = height2;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i32 = height2;
                    int i33 = ((rprVar.q == -3.4028235E38f || i31 >= i27) ? i31 : i27) + i25;
                    float f14 = rprVar.o;
                    if (f14 != -3.4028235E38f) {
                        int round = Math.round(i22 * f14);
                        int i34 = rprVar.A;
                        int i35 = round + i34;
                        int i36 = rprVar.p;
                        if (i36 == 1) {
                            i35 = ((i35 * 2) - i33) / 2;
                        } else if (i36 == 2) {
                            i35 -= i33;
                        }
                        i7 = Math.max(i35, i34);
                        i8 = Math.min(i7 + i33, rprVar.C);
                    } else {
                        i7 = rprVar.A + ((i22 - i33) / 2);
                        i8 = i7 + i33;
                    }
                    int i37 = i8 - i7;
                    if (i37 <= 0) {
                        vq1.n0("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f15 = rprVar.l;
                        if (f15 != -3.4028235E38f) {
                            if (rprVar.m == 0) {
                                i9 = Math.round(i23 * f15) + rprVar.B;
                                int i38 = rprVar.n;
                                if (i38 == 2) {
                                    i9 -= i32;
                                } else if (i38 == 1) {
                                    i9 = ((i9 * 2) - i32) / 2;
                                }
                                z = false;
                            } else {
                                z = false;
                                int lineBottom = rprVar.E.getLineBottom(0) - rprVar.E.getLineTop(0);
                                float f16 = rprVar.l;
                                i9 = f16 >= f5 ? Math.round(f16 * lineBottom) + rprVar.B : (Math.round((f16 + 1.0f) * lineBottom) + rprVar.D) - i32;
                            }
                            int i39 = i9 + i32;
                            int i40 = rprVar.D;
                            if (i39 > i40) {
                                i9 = i40 - i32;
                            } else {
                                int i41 = rprVar.B;
                                if (i9 < i41) {
                                    i9 = i41;
                                }
                            }
                        } else {
                            z = false;
                            i9 = (rprVar.D - i32) - ((int) (i23 * rprVar.z));
                        }
                        rprVar.E = new StaticLayout(spannableStringBuilder3, textPaint, i37, alignment3, rprVar.d, rprVar.e, true);
                        rprVar.F = new StaticLayout(spannableStringBuilder4, textPaint, i37, alignment3, rprVar.d, rprVar.e, true);
                        rprVar.G = i7;
                        rprVar.H = i9;
                        rprVar.I = i24;
                    }
                }
                z = false;
            } else {
                f11 = f11;
                i3 = paddingLeft;
                i4 = paddingTop;
                z = false;
                rprVar.k.getClass();
                Bitmap bitmap2 = rprVar.k;
                int i42 = rprVar.C;
                int i43 = rprVar.A;
                int i44 = rprVar.D;
                int i45 = rprVar.B;
                float f17 = i42 - i43;
                float f18 = (rprVar.o * f17) + i43;
                float f19 = i44 - i45;
                float f20 = (rprVar.l * f19) + i45;
                int round2 = Math.round(f17 * rprVar.q);
                float f21 = rprVar.r;
                int round3 = f21 != -3.4028235E38f ? Math.round(f19 * f21) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * round2);
                int i46 = rprVar.p;
                if (i46 == 2) {
                    f2 = round2;
                } else {
                    if (i46 == 1) {
                        f2 = round2 / 2;
                    }
                    int round4 = Math.round(f18);
                    i5 = rprVar.n;
                    if (i5 != 2) {
                        f3 = round3;
                    } else {
                        if (i5 == 1) {
                            f3 = round3 / 2;
                        }
                        int round5 = Math.round(f20);
                        rprVar.J = new Rect(round4, round5, round2 + round4, round3 + round5);
                    }
                    f20 -= f3;
                    int round52 = Math.round(f20);
                    rprVar.J = new Rect(round4, round52, round2 + round4, round3 + round52);
                }
                f18 -= f2;
                int round42 = Math.round(f18);
                i5 = rprVar.n;
                if (i5 != 2) {
                }
                f20 -= f3;
                int round522 = Math.round(f20);
                rprVar.J = new Rect(round42, round522, round2 + round42, round3 + round522);
            }
            rprVar.a(canvas, z2);
            i12 = i18 + 1;
            ru3Var = this;
            f4 = f5;
            list = list2;
            height = i15;
            i11 = i16;
            size = i17;
            X = f11;
            paddingLeft = i3;
            paddingTop = i4;
        }
    }
}
