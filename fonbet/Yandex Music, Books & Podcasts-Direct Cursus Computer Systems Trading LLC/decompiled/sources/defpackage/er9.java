package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class er9 extends p9 {
    public final ly9 b;
    public final lum c;
    public final boolean d;

    public er9(gp8 gp8Var, ly9 ly9Var, lum lumVar, boolean z) {
        super(gp8Var);
        this.b = ly9Var;
        this.c = lumVar;
        this.d = z;
    }

    public static final int G(er9 er9Var, TextView textView) {
        return Math.min(bg3.F(textView), (int) textView.getPaint().measureText(textView.getText().toString()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if ((r5 != null ? ((java.lang.Boolean) r5.a(r6)).booleanValue() : false) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void H(d89 d89Var, xq9 xq9Var, xzb xzbVar) {
        TextUtils.TruncateAt truncateAt;
        wq9 wq9Var = (wq9) xq9Var.k0.a(xzbVar);
        int ordinal = wq9Var.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            truncateAt = null;
        } else if (ordinal == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (ordinal == 2) {
            truncateAt = TextUtils.TruncateAt.END;
        } else {
            if (ordinal != 3) {
                b6e.s();
                return;
            }
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        d89Var.setEllipsisLocation(truncateAt);
        if (wq9Var != wq9.NONE) {
            szb szbVar = xq9Var.i;
        }
        z = false;
        d89Var.setAutoEllipsize(z);
    }

    public static void K(d89 d89Var, gc8 gc8Var, Long l, Long l2) {
        wj adaptiveMaxLines$div_release = d89Var.getAdaptiveMaxLines$div_release();
        if (adaptiveMaxLines$div_release != null) {
            jb jbVar = adaptiveMaxLines$div_release.c;
            if (jbVar != null) {
                adaptiveMaxLines$div_release.a.removeOnAttachStateChangeListener(jbVar);
            }
            adaptiveMaxLines$div_release.c = null;
            adaptiveMaxLines$div_release.a();
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        if (l == null || l2 == null) {
            if (l != null) {
                long longValue = l.longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue;
                } else if (longValue > 0) {
                    i = Integer.MAX_VALUE;
                }
                i2 = i;
            }
            d89Var.setMaxLines(i2);
            return;
        }
        xzn g = gc8Var.getViewComponent$div_release().g();
        wj wjVar = new wj(d89Var, g);
        long longValue2 = l.longValue();
        long j2 = longValue2 >> 31;
        int i3 = (j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue3 = l2.longValue();
        long j3 = longValue3 >> 31;
        if (j3 == 0 || j3 == -1) {
            i = (int) longValue3;
        } else if (longValue3 > 0) {
            i = Integer.MAX_VALUE;
        }
        vj vjVar = new vj(i3, i);
        if (!Intrinsics.d(wjVar.e, vjVar)) {
            wjVar.e = vjVar;
            WeakHashMap weakHashMap = wdu.a;
            if (d89Var.isAttachedToWindow() && wjVar.d == null) {
                gzj gzjVar = new gzj(new oqj(new k5(2, wjVar)), g);
                d89Var.getViewTreeObserver().addOnPreDrawListener(gzjVar);
                wjVar.d = gzjVar;
            }
            if (wjVar.c == null) {
                jb jbVar2 = new jb(1, wjVar);
                d89Var.addOnAttachStateChangeListener(jbVar2);
                wjVar.c = jbVar2;
            }
        }
        d89Var.setAdaptiveMaxLines$div_release(wjVar);
    }

    public static void P(TextView textView, e89 e89Var) {
        int ordinal = e89Var.ordinal();
        if (ordinal == 0) {
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
        } else {
            if (ordinal != 1) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        }
    }

    public static void Q(TextView textView, om8 om8Var, pm8 pm8Var) {
        textView.setGravity(vq1.N(om8Var, pm8Var));
        int ordinal = om8Var.ordinal();
        int i = 5;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 4;
            } else if (ordinal == 2 || (ordinal != 3 && ordinal == 4)) {
                i = 6;
            }
        }
        textView.setTextAlignment(i);
    }

    public static void R(TextView textView, int i, Integer num) {
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[0]}, new int[]{num != null ? num.intValue() : i, i}));
    }

    public static void S(TextView textView, rtp rtpVar) {
        j1a j1aVar;
        if (rtpVar == null) {
            ViewParent parent = textView.getParent();
            j1aVar = parent instanceof j1a ? (j1a) parent : null;
            if (j1aVar != null) {
                j1aVar.setClipChildren(true);
                j1aVar.setClipToPadding(true);
            }
            textView.setClipToOutline(true);
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            return;
        }
        ViewParent parent2 = textView.getParent();
        j1aVar = parent2 instanceof j1a ? (j1a) parent2 : null;
        if (j1aVar != null) {
            j1aVar.setClipChildren(false);
            j1aVar.setClipToPadding(false);
        }
        textView.setClipToOutline(false);
        textView.setShadowLayer(rtpVar.c, rtpVar.a, rtpVar.b, rtpVar.d);
    }

    public static void T(TextView textView, e89 e89Var) {
        int ordinal = e89Var.ordinal();
        if (ordinal == 0) {
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
        } else {
            if (ordinal != 1) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
    }

    public static rtp U(dj9 dj9Var, xzb xzbVar, DisplayMetrics displayMetrics, int i) {
        float y = bg3.y((Number) dj9Var.b.a(xzbVar), displayMetrics);
        bf9 bf9Var = dj9Var.d;
        float f0 = bg3.f0(bf9Var.a, displayMetrics, xzbVar);
        float f02 = bg3.f0(bf9Var.b, displayMetrics, xzbVar);
        Paint paint = new Paint();
        paint.setColor(((Number) dj9Var.c.a(xzbVar)).intValue());
        paint.setAlpha((int) (((Number) dj9Var.a.a(xzbVar)).doubleValue() * (i >>> 24)));
        return new rtp(f0, f02, y, paint.getColor());
    }

    public final void I(TextView textView, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            int hyphenationFrequency = textView.getHyphenationFrequency();
            int i = 0;
            if (this.d && StringsKt.N(str, (char) 173)) {
                i = 1;
            }
            if (hyphenationFrequency != i) {
                textView.setHyphenationFrequency(i);
            }
        }
    }

    public final void J(TextView textView, long j, la5 la5Var) {
        if (!wyf.K(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new zq9(textView, j, la5Var, this));
            return;
        }
        TextPaint paint = textView.getPaint();
        int i = q6g.e;
        paint.setShader(p6g.q(j, la5Var.a, la5Var.b, G(this, textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
        textView.invalidate();
    }

    public final void L(TextView textView, e23 e23Var, xq9 xq9Var) {
        textView.setText(this.c.x(e23Var, textView, xq9Var, (String) xq9Var.W.a(e23Var.b), null, null, null, null, false));
    }

    public final void M(TextView textView, pcg pcgVar, hag hagVar, hag hagVar2, la5 la5Var) {
        if (!wyf.K(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new c33(textView, pcgVar, hagVar, hagVar2, la5Var, this));
            return;
        }
        TextPaint paint = textView.getPaint();
        int i = gfn.h;
        paint.setShader(ocg.t(pcgVar, hagVar, hagVar2, la5Var.a, la5Var.b, G(this, textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
        textView.invalidate();
    }

    public final void N(x2b x2bVar, e23 e23Var, xq9 xq9Var) {
        pq9 pq9Var = xq9Var.p;
        if (pq9Var == null) {
            x2bVar.setEllipsis("…");
            return;
        }
        az6 az6Var = new az6(24, x2bVar);
        this.c.x(e23Var, x2bVar, xq9Var, (String) pq9Var.d.a(e23Var.b), pq9Var.c, pq9Var.b, pq9Var.a, az6Var, true);
    }

    public final void O(TextView textView, e23 e23Var, xq9 xq9Var) {
        ar9 ar9Var = new ar9(textView, 0);
        this.c.x(e23Var, textView, xq9Var, (String) xq9Var.W.a(e23Var.b), xq9Var.Q, xq9Var.F, null, ar9Var, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0613, code lost:
    
        if (defpackage.xp3.V(r6 != null ? r6.d : r27) != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x084f, code lost:
    
        if (defpackage.xp3.B(r7, r14 != null ? r14.k0 : r27) != false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (defpackage.xp3.B(r7, r14 != null ? r14.Y : null) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0abe, code lost:
    
        if (defpackage.xp3.B((r0 == null || (r1 = r0.d) == null || (r1 = r1.b) == null) ? r14 : r1.a, (r14 == null || (r1 = r14.b0) == null || (r1 = r1.d) == null || (r1 = r1.b) == null) ? r14 : r1.a) != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0b55, code lost:
    
        r1 = r24;
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0b53, code lost:
    
        if (defpackage.xp3.V((r0 == null || (r0 = r0.d) == null || (r0 = r0.b) == null) ? r14 : r0.a) != false) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x08b3, code lost:
    
        if (defpackage.i4w.y(r3, r0) != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0962, code lost:
    
        if (defpackage.i4w.z(r7, r4) != false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
    
        if (defpackage.xp3.B(r13, r14 != null ? r14.s : null) != false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0bf4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0c38  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0c5d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0b87  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0bc4  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x0547 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:769:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [szb] */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70, types: [szb] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v100, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v101 */
    /* JADX WARN: Type inference failed for: r7v102, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v103 */
    /* JADX WARN: Type inference failed for: r7v104, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v105 */
    /* JADX WARN: Type inference failed for: r7v106, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v108, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v117 */
    /* JADX WARN: Type inference failed for: r7v118, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v119 */
    /* JADX WARN: Type inference failed for: r7v120, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v123 */
    /* JADX WARN: Type inference failed for: r7v124, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v125 */
    /* JADX WARN: Type inference failed for: r7v126, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v127 */
    /* JADX WARN: Type inference failed for: r7v128, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v129 */
    /* JADX WARN: Type inference failed for: r7v130, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v131 */
    /* JADX WARN: Type inference failed for: r7v132, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v133 */
    /* JADX WARN: Type inference failed for: r7v134, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v146 */
    /* JADX WARN: Type inference failed for: r7v147, types: [pq9] */
    /* JADX WARN: Type inference failed for: r7v148 */
    /* JADX WARN: Type inference failed for: r7v149, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v153 */
    /* JADX WARN: Type inference failed for: r7v154, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v158 */
    /* JADX WARN: Type inference failed for: r7v159, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v200 */
    /* JADX WARN: Type inference failed for: r7v201 */
    /* JADX WARN: Type inference failed for: r7v202 */
    /* JADX WARN: Type inference failed for: r7v203 */
    /* JADX WARN: Type inference failed for: r7v204 */
    /* JADX WARN: Type inference failed for: r7v205 */
    /* JADX WARN: Type inference failed for: r7v206 */
    /* JADX WARN: Type inference failed for: r7v207 */
    /* JADX WARN: Type inference failed for: r7v208 */
    /* JADX WARN: Type inference failed for: r7v209 */
    /* JADX WARN: Type inference failed for: r7v210 */
    /* JADX WARN: Type inference failed for: r7v211 */
    /* JADX WARN: Type inference failed for: r7v212 */
    /* JADX WARN: Type inference failed for: r7v213 */
    /* JADX WARN: Type inference failed for: r7v214 */
    /* JADX WARN: Type inference failed for: r7v215 */
    /* JADX WARN: Type inference failed for: r7v216 */
    /* JADX WARN: Type inference failed for: r7v217 */
    /* JADX WARN: Type inference failed for: r7v218 */
    /* JADX WARN: Type inference failed for: r7v219 */
    /* JADX WARN: Type inference failed for: r7v220 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72, types: [rtp] */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v97 */
    /* JADX WARN: Type inference failed for: r7v98, types: [szb] */
    /* JADX WARN: Type inference failed for: r7v99 */
    @Override // defpackage.p9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2) {
        xq9 xq9Var;
        szb szbVar;
        xq9 xq9Var2;
        szb szbVar2;
        er9 er9Var;
        szb szbVar3;
        szb szbVar4;
        szb szbVar5;
        szb szbVar6;
        gc8 gc8Var;
        xq9 xq9Var3;
        e23 e23Var2;
        xzb xzbVar;
        szb szbVar7;
        szb szbVar8;
        szb szbVar9;
        List list;
        ja8 ja8Var;
        xzb xzbVar2;
        List<tq9> list2;
        List list3;
        ln9 ln9Var;
        szb szbVar10;
        ln9 ln9Var2;
        szb szbVar11;
        xq9 xq9Var4;
        ln9 ln9Var3;
        szb szbVar12;
        ln9 ln9Var4;
        szb szbVar13;
        szb szbVar14;
        szb szbVar15;
        er9 er9Var2;
        xzb xzbVar3;
        xq9 xq9Var5;
        jr9 jr9Var;
        Shader shader;
        xzb xzbVar4;
        dj9 dj9Var;
        bf9 bf9Var;
        ow8 ow8Var;
        szb szbVar16;
        bf9 bf9Var2;
        ow8 ow8Var2;
        szb szbVar17;
        bf9 bf9Var3;
        ow8 ow8Var3;
        szb szbVar18;
        bf9 bf9Var4;
        ow8 ow8Var4;
        szb szbVar19;
        szb szbVar20;
        szb szbVar21;
        szb szbVar22;
        bf9 bf9Var5;
        ow8 ow8Var5;
        bf9 bf9Var6;
        ow8 ow8Var6;
        bf9 bf9Var7;
        ow8 ow8Var7;
        szb szbVar23;
        szb szbVar24;
        dj9 dj9Var2;
        bf9 bf9Var8;
        ow8 ow8Var8;
        bf9 bf9Var9;
        ow8 ow8Var9;
        dj9 dj9Var3;
        bf9 bf9Var10;
        ow8 ow8Var10;
        bf9 bf9Var11;
        ow8 ow8Var11;
        dj9 dj9Var4;
        bf9 bf9Var12;
        ow8 ow8Var12;
        bf9 bf9Var13;
        ow8 ow8Var13;
        dj9 dj9Var5;
        dj9 dj9Var6;
        dj9 dj9Var7;
        szb szbVar25;
        szb szbVar26;
        d89 d89Var = (d89) view;
        xq9 xq9Var6 = (xq9) dp8Var;
        xq9 xq9Var7 = (xq9) dp8Var2;
        gc8 gc8Var2 = e23Var.a;
        gc8 gc8Var3 = e23Var.a;
        xzb xzbVar5 = e23Var.b;
        d89Var.setDrawingPassOverrideStrategy$div_release(gc8Var2.getViewComponent$div_release().g());
        bd8 bd8Var = xq9Var6.b;
        pq9 pq9Var = xq9Var6.p;
        List list4 = xq9Var6.Q;
        szb szbVar27 = xq9Var6.s;
        szb szbVar28 = xq9Var6.Z;
        bg3.k(d89Var, e23Var, bd8Var, xq9Var6.d, xq9Var6.J, xq9Var6.o, xq9Var6.D, xq9Var6.C, xq9Var6.P, xq9Var6.O, xq9Var6.c, xq9Var6.l);
        xzb xzbVar6 = e23Var.b;
        woe.u(d89Var, xq9Var6.t, xq9Var6.y, xq9Var6.z, xq9Var6.x, xq9Var7 != null ? xq9Var7.t : null, xq9Var7 != null ? xq9Var7.y : null, xq9Var7 != null ? xq9Var7.z : null, xq9Var7 != null ? xq9Var7.x : null, xq9Var7, this.b, xzbVar6);
        szb szbVar29 = xq9Var6.X;
        szb szbVar30 = xq9Var6.Y;
        if (xp3.B(szbVar29, xq9Var7 != null ? xq9Var7.X : null)) {
        }
        Q(d89Var, (om8) szbVar29.a(xzbVar6), (pm8) szbVar30.a(xzbVar6));
        if (!(szbVar29 instanceof ozb) || !(szbVar30 instanceof ozb)) {
            br9 br9Var = new br9(this, d89Var, xq9Var6, xzbVar6, 2);
            xq9Var = xq9Var6;
            d89Var.i(szbVar29.c(xzbVar6, br9Var));
            d89Var.i(szbVar30.c(xzbVar6, br9Var));
            woe.r(d89Var, xq9Var.v, xq9Var.w, xq9Var7 == null ? xq9Var7.v : null, xq9Var7 == null ? xq9Var7.w : null, xzbVar6, d89Var);
            woe.s(d89Var, xq9Var.H, xq9Var.v, xq9Var7 == null ? xq9Var7.H : null, xq9Var7 == null ? xq9Var7.v : null, xzbVar6, d89Var);
            d89 d89Var2 = d89Var;
            szbVar = xq9Var.u;
            if (!xp3.B(szbVar, xq9Var7 == null ? xq9Var7.u : null)) {
                String str = szbVar != null ? (String) szbVar.a(xzbVar6) : null;
                if (str == null || !(!StringsKt.U(str))) {
                    str = null;
                }
                d89Var2.setFontFeatureSettings(str);
                if (!xp3.V(szbVar)) {
                    xq9Var2 = xq9Var;
                    d89Var2.i(szbVar != null ? szbVar.c(xzbVar6, new br9(this, d89Var2, xq9Var2, xzbVar6, 1)) : null);
                    if (xp3.B(szbVar28, xq9Var7 != null ? xq9Var7.Z : null)) {
                        szbVar2 = szbVar27;
                    } else {
                        szbVar2 = szbVar27;
                    }
                    R(d89Var2, ((Number) szbVar28.a(xzbVar6)).intValue(), szbVar2 != null ? (Integer) szbVar2.a(xzbVar6) : null);
                    if ((szbVar28 instanceof ozb) || !xp3.V(szbVar2)) {
                        er9Var = this;
                        br9 br9Var2 = new br9(er9Var, d89Var2, xq9Var2, xzbVar6, 3);
                        d89Var2.i(szbVar28.c(xzbVar6, br9Var2));
                        d89Var2.i(szbVar2 != null ? szbVar2.c(xzbVar6, br9Var2) : null);
                        szbVar3 = xq9Var2.l0;
                        if (!xp3.B(szbVar3, xq9Var7 == null ? xq9Var7.l0 : null)) {
                            T(d89Var2, (e89) szbVar3.a(xzbVar6));
                            if (!(szbVar3 instanceof ozb)) {
                                d89Var2.i(szbVar3.c(xzbVar6, new cr9(er9Var, d89Var2, 4)));
                            }
                        }
                        szbVar4 = xq9Var2.V;
                        if (!xp3.B(szbVar4, xq9Var7 == null ? xq9Var7.V : null)) {
                            P(d89Var2, (e89) szbVar4.a(xzbVar6));
                            if (!(szbVar4 instanceof ozb)) {
                                d89Var2.i(szbVar4.c(xzbVar6, new cr9(er9Var, d89Var2, 2)));
                            }
                        }
                        szbVar5 = xq9Var2.L;
                        szbVar6 = xq9Var2.M;
                        if (xp3.B(szbVar5, xq9Var7 == null ? xq9Var7.L : null)) {
                            if (xp3.B(szbVar6, xq9Var7 != null ? xq9Var7.M : null)) {
                                gc8Var = gc8Var3;
                                xzbVar = xzbVar6;
                                xq9Var3 = xq9Var2;
                                e23Var2 = e23Var;
                                szbVar7 = xq9Var3.I;
                                szbVar8 = xq9Var3.w;
                                szbVar9 = xq9Var3.W;
                                list = xq9Var3.F;
                                if (list4 == null || list != null) {
                                    ja8Var = null;
                                    er9Var.O(d89Var2, e23Var2, xq9Var3);
                                    xzbVar2 = xzbVar5;
                                    er9Var.I(d89Var2, (String) szbVar9.a(xzbVar2));
                                    d89Var2.i(szbVar9.c(xzbVar2, new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 1)));
                                    er9Var = this;
                                    e23Var2 = e23Var;
                                    dr9 dr9Var = new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 2);
                                    d89Var2.i(xq9Var3.v.c(xzbVar2, dr9Var));
                                    d89Var2.i(szbVar8.c(xzbVar2, dr9Var));
                                    szb szbVar31 = xq9Var3.t;
                                    d89Var2.i(szbVar31 == null ? szbVar31.c(xzbVar2, dr9Var) : null);
                                    d89Var2.i(szbVar7 == null ? szbVar7.c(xzbVar2, dr9Var) : null);
                                    if (list4 != null) {
                                        Iterator it = list4.iterator();
                                        while (it.hasNext()) {
                                            uq9 uq9Var = (uq9) it.next();
                                            szb szbVar32 = uq9Var.q;
                                            js9 js9Var = uq9Var.e;
                                            d89Var2.i(szbVar32.c(xzbVar2, dr9Var));
                                            szb szbVar33 = uq9Var.f;
                                            d89Var2.i(szbVar33 != null ? szbVar33.c(xzbVar2, dr9Var) : null);
                                            szb szbVar34 = uq9Var.b;
                                            d89Var2.i(szbVar34 != null ? szbVar34.c(xzbVar2, dr9Var) : null);
                                            d89Var2.i(uq9Var.d.c(xzbVar2, dr9Var));
                                            szb szbVar35 = uq9Var.i;
                                            d89Var2.i(szbVar35 != null ? szbVar35.c(xzbVar2, dr9Var) : null);
                                            d89Var2.i(uq9Var.j.c(xzbVar2, dr9Var));
                                            szb szbVar36 = uq9Var.g;
                                            d89Var2.i(szbVar36 != null ? szbVar36.c(xzbVar2, dr9Var) : null);
                                            szb szbVar37 = uq9Var.l;
                                            d89Var2.i(szbVar37 != null ? szbVar37.c(xzbVar2, dr9Var) : null);
                                            szb szbVar38 = uq9Var.m;
                                            d89Var2.i(szbVar38 != null ? szbVar38.c(xzbVar2, dr9Var) : null);
                                            szb szbVar39 = uq9Var.h;
                                            d89Var2.i(szbVar39 != null ? szbVar39.c(xzbVar2, dr9Var) : null);
                                            szb szbVar40 = uq9Var.n;
                                            d89Var2.i(szbVar40 != null ? szbVar40.c(xzbVar2, dr9Var) : null);
                                            szb szbVar41 = uq9Var.o;
                                            d89Var2.i(szbVar41 != null ? szbVar41.c(xzbVar2, dr9Var) : null);
                                            szb szbVar42 = uq9Var.r;
                                            d89Var2.i(szbVar42 != null ? szbVar42.c(xzbVar2, dr9Var) : null);
                                            szb szbVar43 = uq9Var.s;
                                            d89Var2.i(szbVar43 != null ? szbVar43.c(xzbVar2, dr9Var) : null);
                                            szb szbVar44 = uq9Var.u;
                                            d89Var2.i(szbVar44 != null ? szbVar44.c(xzbVar2, dr9Var) : null);
                                            szb szbVar45 = uq9Var.v;
                                            d89Var2.i(szbVar45 != null ? szbVar45.c(xzbVar2, dr9Var) : null);
                                            cs9 cs9Var = uq9Var.c;
                                            Object a = cs9Var != null ? cs9Var.a() : null;
                                            Iterator it2 = it;
                                            if (a instanceof xl9) {
                                                d89Var2.i(((xl9) a).a.c(xzbVar2, dr9Var));
                                            }
                                            ts9 ts9Var = uq9Var.p;
                                            Object a2 = ts9Var != null ? ts9Var.a() : null;
                                            if (a2 instanceof it9) {
                                                it9 it9Var = (it9) a2;
                                                d89Var2.i(it9Var.b.c(xzbVar2, dr9Var));
                                                d89Var2.i(it9Var.a.c(xzbVar2, dr9Var));
                                            } else if (a2 instanceof ct9) {
                                                ct9 ct9Var = (ct9) a2;
                                                jz8 jz8Var = ct9Var.e;
                                                list3 = list;
                                                d89Var2.i(ct9Var.d.c(xzbVar2, dr9Var));
                                                d89Var2.i(ct9Var.a.c(xzbVar2, dr9Var));
                                                d89Var2.i(ct9Var.b.c(xzbVar2, dr9Var));
                                                d89Var2.i(ct9Var.c.c(xzbVar2, dr9Var));
                                                d89Var2.i(jz8Var.b.c(xzbVar2, dr9Var));
                                                d89Var2.i(jz8Var.a.c(xzbVar2, dr9Var));
                                                d89Var2.i((js9Var != null || (ln9Var2 = js9Var.b) == null || (szbVar11 = ln9Var2.a) == null) ? null : szbVar11.c(xzbVar2, dr9Var));
                                                d89Var2.i((js9Var != null || (ln9Var = js9Var.b) == null || (szbVar10 = ln9Var.d) == null) ? null : szbVar10.c(xzbVar2, dr9Var));
                                                if (woe.m()) {
                                                    szb szbVar46 = uq9Var.k;
                                                    d89Var2.i(szbVar46 != null ? szbVar46.c(xzbVar2, dr9Var) : null);
                                                }
                                                it = it2;
                                                list = list3;
                                            }
                                            list3 = list;
                                            d89Var2.i((js9Var != null || (ln9Var2 = js9Var.b) == null || (szbVar11 = ln9Var2.a) == null) ? null : szbVar11.c(xzbVar2, dr9Var));
                                            d89Var2.i((js9Var != null || (ln9Var = js9Var.b) == null || (szbVar10 = ln9Var.d) == null) ? null : szbVar10.c(xzbVar2, dr9Var));
                                            if (woe.m()) {
                                            }
                                            it = it2;
                                            list = list3;
                                        }
                                    }
                                    list2 = list;
                                    if (list2 != null) {
                                        for (tq9 tq9Var : list2) {
                                            szb szbVar47 = tq9Var.f;
                                            jz8 jz8Var2 = tq9Var.j;
                                            d89Var2.i(szbVar47.c(xzbVar2, dr9Var));
                                            d89Var2.i(tq9Var.d.c(xzbVar2, dr9Var));
                                            d89Var2.i(tq9Var.i.c(xzbVar2, dr9Var));
                                            d89Var2.i(tq9Var.b.c(xzbVar2, dr9Var));
                                            szb szbVar48 = tq9Var.g;
                                            d89Var2.i(szbVar48 != null ? szbVar48.c(xzbVar2, dr9Var) : null);
                                            d89Var2.i(jz8Var2.b.c(xzbVar2, dr9Var));
                                            d89Var2.i(jz8Var2.a.c(xzbVar2, dr9Var));
                                        }
                                    }
                                } else {
                                    if (xp3.B(szbVar9, xq9Var7 != null ? xq9Var7.W : null)) {
                                        if (xp3.B(szbVar7, xq9Var7 != null ? xq9Var7.I : null)) {
                                            if (xp3.B(szbVar8, xq9Var7 != null ? xq9Var7.w : null)) {
                                                List list5 = xq9Var3.q;
                                                List list6 = xq9Var7 != null ? xq9Var7.q : null;
                                                if (list5 == null && list6 == null) {
                                                    ja8Var = null;
                                                } else if (list5 != null && list6 != null) {
                                                    ja8Var = null;
                                                    if (list5.size() == list6.size()) {
                                                        int i = 0;
                                                        for (Object obj : list5) {
                                                            int i2 = i + 1;
                                                            if (i < 0) {
                                                                u75.n();
                                                                throw null;
                                                            }
                                                            if (Intrinsics.d(((rx8) obj).a, ((rx8) list6.get(i)).a)) {
                                                                i = i2;
                                                            }
                                                        }
                                                    }
                                                    xzb xzbVar7 = e23Var2.b;
                                                    String str2 = (String) szbVar9.a(xzbVar7);
                                                    er9Var.L(d89Var2, e23Var2, xq9Var3);
                                                    er9Var.I(d89Var2, str2);
                                                    if ((szbVar9 instanceof ozb) || !xp3.V(szbVar7) || !xp3.V(szbVar8)) {
                                                        e23 e23Var3 = e23Var2;
                                                        er9 er9Var3 = er9Var;
                                                        xq9 xq9Var8 = xq9Var3;
                                                        ii iiVar = new ii(xq9Var8, xzbVar7, er9Var3, d89Var2, e23Var3, 20);
                                                        d89Var2 = d89Var2;
                                                        xq9Var3 = xq9Var8;
                                                        er9Var = er9Var3;
                                                        e23Var2 = e23Var3;
                                                        d89Var2.i(szbVar9.c(xzbVar7, iiVar));
                                                        d89Var2.i(szbVar7 == null ? szbVar7.c(xzbVar7, iiVar) : ja8Var);
                                                        d89Var2.i(szbVar8.c(xzbVar7, iiVar));
                                                    }
                                                }
                                                xzbVar2 = xzbVar5;
                                            }
                                        }
                                    }
                                    ja8Var = null;
                                    xzb xzbVar72 = e23Var2.b;
                                    String str22 = (String) szbVar9.a(xzbVar72);
                                    er9Var.L(d89Var2, e23Var2, xq9Var3);
                                    er9Var.I(d89Var2, str22);
                                    if (szbVar9 instanceof ozb) {
                                    }
                                    e23 e23Var32 = e23Var2;
                                    er9 er9Var32 = er9Var;
                                    xq9 xq9Var82 = xq9Var3;
                                    ii iiVar2 = new ii(xq9Var82, xzbVar72, er9Var32, d89Var2, e23Var32, 20);
                                    d89Var2 = d89Var2;
                                    xq9Var3 = xq9Var82;
                                    er9Var = er9Var32;
                                    e23Var2 = e23Var32;
                                    d89Var2.i(szbVar9.c(xzbVar72, iiVar2));
                                    d89Var2.i(szbVar7 == null ? szbVar7.c(xzbVar72, iiVar2) : ja8Var);
                                    d89Var2.i(szbVar8.c(xzbVar72, iiVar2));
                                    xzbVar2 = xzbVar5;
                                }
                                if ((pq9Var == null ? pq9Var.c : ja8Var) == null) {
                                    if ((pq9Var != null ? pq9Var.b : ja8Var) == null) {
                                        if ((pq9Var != null ? pq9Var.a : ja8Var) == null) {
                                            ?? r7 = xq9Var7 != null ? xq9Var7.p : ja8Var;
                                            if (!xp3.B(pq9Var != null ? pq9Var.d : ja8Var, r7 != 0 ? r7.d : ja8Var)) {
                                                CharSequence charSequence = (pq9Var == null || (szbVar26 = pq9Var.d) == null) ? ja8Var : (String) szbVar26.a(xzbVar2);
                                                if (charSequence == null) {
                                                    charSequence = "…";
                                                }
                                                d89Var2.setEllipsis(charSequence);
                                                if (xp3.V(pq9Var != null ? pq9Var.d : ja8Var)) {
                                                }
                                                d89Var2.i((pq9Var == null || (szbVar25 = pq9Var.d) == null) ? ja8Var : szbVar25.c(xzbVar2, new cr9(er9Var, d89Var2, 0)));
                                            }
                                            xq9Var4 = xq9Var3;
                                            szbVar14 = xq9Var4.i;
                                            szbVar15 = xq9Var4.k0;
                                            if (xp3.B(szbVar14, xq9Var7 == null ? xq9Var7.i : ja8Var)) {
                                            }
                                            H(d89Var2, xq9Var4, xzbVar);
                                            if (xp3.V(szbVar14) || !(szbVar15 instanceof ozb)) {
                                                er9Var2 = this;
                                                xzbVar3 = xzbVar;
                                                br9 br9Var3 = new br9(er9Var2, d89Var2, xq9Var4, xzbVar3, 0);
                                                xq9Var5 = xq9Var4;
                                                if (szbVar14 != null) {
                                                    d89Var2.i(szbVar14.c(xzbVar3, br9Var3));
                                                }
                                                d89Var2.i(szbVar15.c(xzbVar3, br9Var3));
                                                jr9Var = xq9Var5.a0;
                                                if (jr9Var == null) {
                                                    shader = ja8Var;
                                                    d89Var2.getPaint().setShader(shader);
                                                } else {
                                                    shader = ja8Var;
                                                    if (jr9Var instanceof hr9) {
                                                        g89 g89Var = ((hr9) jr9Var).b;
                                                        szb szbVar49 = g89Var.a;
                                                        Object obj2 = xq9Var7 != null ? xq9Var7.a0 : shader;
                                                        if (obj2 instanceof hr9) {
                                                            g89 g89Var2 = ((hr9) obj2).b;
                                                            if (xp3.B(szbVar49, g89Var2.a)) {
                                                            }
                                                        }
                                                        List<f89> list7 = g89Var.b;
                                                        vzb vzbVar = g89Var.c;
                                                        long longValue = ((Number) szbVar49.a(xzbVar3)).longValue();
                                                        la5 V = i4w.V(g89Var, xzbVar3);
                                                        xv.D(V, gc8Var);
                                                        er9Var2.J(d89Var2, longValue, V);
                                                        if (!(szbVar49 instanceof ozb) || ((vzbVar != null && !(vzbVar instanceof i86)) || !i4w.L(list7))) {
                                                            ii iiVar3 = new ii(er9Var2, d89Var2, g89Var, xzbVar3, gc8Var, 19);
                                                            xzbVar4 = xzbVar3;
                                                            d89Var2.i(szbVar49.c(xzbVar4, iiVar3));
                                                            d89Var2.i(vzbVar != null ? vzbVar.b(xzbVar4, iiVar3) : shader);
                                                            if (list7 != null) {
                                                                for (f89 f89Var : list7) {
                                                                    if (f89Var != null) {
                                                                        d89Var2.i(f89Var.a.c(xzbVar4, iiVar3));
                                                                        d89Var2.i(f89Var.b.c(xzbVar4, iiVar3));
                                                                    }
                                                                }
                                                            }
                                                            xzbVar3 = xzbVar4;
                                                        }
                                                    } else {
                                                        xzbVar4 = xzbVar3;
                                                        if (jr9Var instanceof ir9) {
                                                            of9 of9Var = ((ir9) jr9Var).b;
                                                            rf9 rf9Var = of9Var.b;
                                                            rf9 rf9Var2 = of9Var.a;
                                                            mg9 mg9Var = of9Var.e;
                                                            Object obj3 = xq9Var7 != null ? xq9Var7.a0 : shader;
                                                            if (obj3 instanceof ir9) {
                                                                of9 of9Var2 = ((ir9) obj3).b;
                                                                if (Intrinsics.d(mg9Var, of9Var2.e)) {
                                                                    if (Intrinsics.d(rf9Var2, of9Var2.a)) {
                                                                        if (Intrinsics.d(rf9Var, of9Var2.b)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            DisplayMetrics displayMetrics = d89Var2.getResources().getDisplayMetrics();
                                                            vzb vzbVar2 = of9Var.d;
                                                            List<nf9> list8 = of9Var.c;
                                                            pcg Z = i4w.Z(mg9Var, displayMetrics, xzbVar4);
                                                            hag Y = i4w.Y(rf9Var2, displayMetrics, xzbVar4);
                                                            hag Y2 = i4w.Y(rf9Var, displayMetrics, xzbVar4);
                                                            la5 W = i4w.W(of9Var, xzbVar4);
                                                            xv.D(W, gc8Var);
                                                            d89 d89Var3 = d89Var2;
                                                            M(d89Var3, Z, Y, Y2, W);
                                                            d89Var2 = d89Var3;
                                                            boolean N = i4w.N(list8);
                                                            if ((vzbVar2 != null && !(vzbVar2 instanceof i86)) || !N) {
                                                                a03 a03Var = new a03(this, d89Var2, of9Var, displayMetrics, xzbVar4, gc8Var, 7);
                                                                xzbVar3 = xzbVar4;
                                                                d89Var2.i(vzbVar2 != null ? vzbVar2.b(xzbVar3, a03Var) : shader);
                                                                if (list8 != null) {
                                                                    for (nf9 nf9Var : list8) {
                                                                        if (nf9Var != null) {
                                                                            d89Var2.i(nf9Var.a.c(xzbVar3, a03Var));
                                                                            d89Var2.i(nf9Var.b.c(xzbVar3, a03Var));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        xzbVar3 = xzbVar4;
                                                    }
                                                }
                                                dj9Var = xq9Var5.b0;
                                                if (xp3.B(dj9Var != null ? dj9Var.a : shader, (xq9Var7 != null || (dj9Var7 = xq9Var7.b0) == null) ? shader : dj9Var7.a)) {
                                                    if (xp3.B(dj9Var != null ? dj9Var.b : shader, (xq9Var7 == null || (dj9Var6 = xq9Var7.b0) == null) ? shader : dj9Var6.b)) {
                                                        if (xp3.B(dj9Var != null ? dj9Var.c : shader, (xq9Var7 == null || (dj9Var5 = xq9Var7.b0) == null) ? shader : dj9Var5.c)) {
                                                            if (xp3.B((dj9Var == null || (bf9Var13 = dj9Var.d) == null || (ow8Var13 = bf9Var13.a) == null) ? shader : ow8Var13.b, (xq9Var7 == null || (dj9Var4 = xq9Var7.b0) == null || (bf9Var12 = dj9Var4.d) == null || (ow8Var12 = bf9Var12.a) == null) ? shader : ow8Var12.b)) {
                                                                if (xp3.B((dj9Var == null || (bf9Var11 = dj9Var.d) == null || (ow8Var11 = bf9Var11.a) == null) ? shader : ow8Var11.a, (xq9Var7 == null || (dj9Var3 = xq9Var7.b0) == null || (bf9Var10 = dj9Var3.d) == null || (ow8Var10 = bf9Var10.a) == null) ? shader : ow8Var10.a)) {
                                                                    if (xp3.B((dj9Var == null || (bf9Var9 = dj9Var.d) == null || (ow8Var9 = bf9Var9.b) == null) ? shader : ow8Var9.b, (xq9Var7 == null || (dj9Var2 = xq9Var7.b0) == null || (bf9Var8 = dj9Var2.d) == null || (ow8Var8 = bf9Var8.b) == null) ? shader : ow8Var8.b)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                dj9 dj9Var8 = xq9Var5.b0;
                                                DisplayMetrics displayMetrics2 = d89Var2.getResources().getDisplayMetrics();
                                                S(d89Var2, dj9Var8 != null ? U(dj9Var8, xzbVar3, displayMetrics2, ((Number) szbVar28.a(xzbVar3)).intValue()) : shader);
                                                if (xp3.V(dj9Var != null ? dj9Var.a : shader)) {
                                                    if (xp3.V(dj9Var != null ? dj9Var.b : shader)) {
                                                        if (xp3.V(dj9Var != null ? dj9Var.c : shader)) {
                                                            if (xp3.V((dj9Var == null || (bf9Var7 = dj9Var.d) == null || (ow8Var7 = bf9Var7.a) == null) ? shader : ow8Var7.b)) {
                                                                if (xp3.V((dj9Var == null || (bf9Var6 = dj9Var.d) == null || (ow8Var6 = bf9Var6.a) == null) ? shader : ow8Var6.a)) {
                                                                    if (xp3.V((dj9Var == null || (bf9Var5 = dj9Var.d) == null || (ow8Var5 = bf9Var5.b) == null) ? shader : ow8Var5.b)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                er9 er9Var4 = this;
                                                xq9 xq9Var9 = xq9Var5;
                                                ii iiVar4 = new ii(er9Var4, d89Var2, dj9Var8, xzbVar3, displayMetrics2, xq9Var9, 21);
                                                xq9 xq9Var10 = xq9Var9;
                                                d89Var2.i((dj9Var8 != null || (szbVar22 = dj9Var8.a) == null) ? shader : szbVar22.c(xzbVar3, iiVar4));
                                                d89Var2.i((dj9Var8 != null || (szbVar21 = dj9Var8.c) == null) ? shader : szbVar21.c(xzbVar3, iiVar4));
                                                d89Var2.i((dj9Var8 != null || (szbVar20 = dj9Var8.b) == null) ? shader : szbVar20.c(xzbVar3, iiVar4));
                                                d89Var2.i((dj9Var8 != null || (bf9Var4 = dj9Var8.d) == null || (ow8Var4 = bf9Var4.a) == null || (szbVar19 = ow8Var4.b) == null) ? shader : szbVar19.c(xzbVar3, iiVar4));
                                                d89Var2.i((dj9Var8 != null || (bf9Var3 = dj9Var8.d) == null || (ow8Var3 = bf9Var3.a) == null || (szbVar18 = ow8Var3.a) == null) ? shader : szbVar18.c(xzbVar3, iiVar4));
                                                d89Var2.i((dj9Var8 != null || (bf9Var2 = dj9Var8.d) == null || (ow8Var2 = bf9Var2.b) == null || (szbVar17 = ow8Var2.b) == null) ? shader : szbVar17.c(xzbVar3, iiVar4));
                                                d89Var2.i((dj9Var8 != null || (bf9Var = dj9Var8.d) == null || (ow8Var = bf9Var.b) == null || (szbVar16 = ow8Var.a) == null) ? shader : szbVar16.c(xzbVar3, iiVar4));
                                                szbVar23 = xq9Var10.T;
                                                if (!xp3.B(szbVar23, xq9Var7 != null ? xq9Var7.T : shader)) {
                                                    boolean booleanValue = ((Boolean) szbVar23.a(xzbVar3)).booleanValue();
                                                    MovementMethod movementMethod = d89Var2.getMovementMethod();
                                                    d89Var2.setTextIsSelectable(booleanValue);
                                                    if (movementMethod instanceof kdp) {
                                                        d89Var2.setMovementMethod(movementMethod);
                                                    }
                                                    if (!(szbVar23 instanceof ozb)) {
                                                        d89Var2.i(szbVar23.c(xzbVar3, new cr9(er9Var4, d89Var2, 1)));
                                                    }
                                                }
                                                szbVar24 = xq9Var10.c0;
                                                if (!xp3.B(szbVar24, xq9Var7 != null ? xq9Var7.c0 : shader)) {
                                                    d89Var2.setTightenWidth(((Boolean) szbVar24.a(xzbVar3)).booleanValue());
                                                    if (!(szbVar24 instanceof ozb)) {
                                                        d89Var2.i(szbVar24.c(xzbVar3, new cr9(er9Var4, d89Var2, 3)));
                                                    }
                                                }
                                                d89Var2.setFocusable((d89Var2.isFocusable() && szbVar2 == null) ? false : true);
                                            }
                                            er9Var2 = this;
                                            xq9Var5 = xq9Var4;
                                            xzbVar3 = xzbVar;
                                            jr9Var = xq9Var5.a0;
                                            if (jr9Var == null) {
                                            }
                                            dj9Var = xq9Var5.b0;
                                            if (xp3.B(dj9Var != null ? dj9Var.a : shader, (xq9Var7 != null || (dj9Var7 = xq9Var7.b0) == null) ? shader : dj9Var7.a)) {
                                            }
                                            dj9 dj9Var82 = xq9Var5.b0;
                                            DisplayMetrics displayMetrics22 = d89Var2.getResources().getDisplayMetrics();
                                            S(d89Var2, dj9Var82 != null ? U(dj9Var82, xzbVar3, displayMetrics22, ((Number) szbVar28.a(xzbVar3)).intValue()) : shader);
                                            if (xp3.V(dj9Var != null ? dj9Var.a : shader)) {
                                            }
                                            er9 er9Var42 = this;
                                            xq9 xq9Var92 = xq9Var5;
                                            ii iiVar42 = new ii(er9Var42, d89Var2, dj9Var82, xzbVar3, displayMetrics22, xq9Var92, 21);
                                            xq9 xq9Var102 = xq9Var92;
                                            d89Var2.i((dj9Var82 != null || (szbVar22 = dj9Var82.a) == null) ? shader : szbVar22.c(xzbVar3, iiVar42));
                                            d89Var2.i((dj9Var82 != null || (szbVar21 = dj9Var82.c) == null) ? shader : szbVar21.c(xzbVar3, iiVar42));
                                            d89Var2.i((dj9Var82 != null || (szbVar20 = dj9Var82.b) == null) ? shader : szbVar20.c(xzbVar3, iiVar42));
                                            d89Var2.i((dj9Var82 != null || (bf9Var4 = dj9Var82.d) == null || (ow8Var4 = bf9Var4.a) == null || (szbVar19 = ow8Var4.b) == null) ? shader : szbVar19.c(xzbVar3, iiVar42));
                                            d89Var2.i((dj9Var82 != null || (bf9Var3 = dj9Var82.d) == null || (ow8Var3 = bf9Var3.a) == null || (szbVar18 = ow8Var3.a) == null) ? shader : szbVar18.c(xzbVar3, iiVar42));
                                            d89Var2.i((dj9Var82 != null || (bf9Var2 = dj9Var82.d) == null || (ow8Var2 = bf9Var2.b) == null || (szbVar17 = ow8Var2.b) == null) ? shader : szbVar17.c(xzbVar3, iiVar42));
                                            d89Var2.i((dj9Var82 != null || (bf9Var = dj9Var82.d) == null || (ow8Var = bf9Var.b) == null || (szbVar16 = ow8Var.a) == null) ? shader : szbVar16.c(xzbVar3, iiVar42));
                                            szbVar23 = xq9Var102.T;
                                            if (!xp3.B(szbVar23, xq9Var7 != null ? xq9Var7.T : shader)) {
                                            }
                                            szbVar24 = xq9Var102.c0;
                                            if (!xp3.B(szbVar24, xq9Var7 != null ? xq9Var7.c0 : shader)) {
                                            }
                                            d89Var2.setFocusable((d89Var2.isFocusable() && szbVar2 == null) ? false : true);
                                        }
                                    }
                                }
                                er9Var.N(d89Var2, e23Var2, xq9Var3);
                                if (pq9Var != null) {
                                    dr9 dr9Var2 = new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 0);
                                    xq9Var4 = xq9Var3;
                                    d89Var2.i(pq9Var.d.c(xzbVar2, dr9Var2));
                                    List<uq9> list9 = pq9Var.c;
                                    if (list9 != null) {
                                        for (uq9 uq9Var2 : list9) {
                                            szb szbVar50 = uq9Var2.q;
                                            js9 js9Var2 = uq9Var2.e;
                                            d89Var2.i(szbVar50.c(xzbVar2, dr9Var2));
                                            szb szbVar51 = uq9Var2.f;
                                            d89Var2.i(szbVar51 != null ? szbVar51.c(xzbVar2, dr9Var2) : ja8Var);
                                            szb szbVar52 = uq9Var2.b;
                                            d89Var2.i(szbVar52 != null ? szbVar52.c(xzbVar2, dr9Var2) : ja8Var);
                                            d89Var2.i(uq9Var2.d.c(xzbVar2, dr9Var2));
                                            szb szbVar53 = uq9Var2.i;
                                            d89Var2.i(szbVar53 != null ? szbVar53.c(xzbVar2, dr9Var2) : ja8Var);
                                            d89Var2.i(uq9Var2.j.c(xzbVar2, dr9Var2));
                                            szb szbVar54 = uq9Var2.g;
                                            d89Var2.i(szbVar54 != null ? szbVar54.c(xzbVar2, dr9Var2) : ja8Var);
                                            szb szbVar55 = uq9Var2.l;
                                            d89Var2.i(szbVar55 != null ? szbVar55.c(xzbVar2, dr9Var2) : ja8Var);
                                            szb szbVar56 = uq9Var2.m;
                                            d89Var2.i(szbVar56 != null ? szbVar56.c(xzbVar2, dr9Var2) : ja8Var);
                                            szb szbVar57 = uq9Var2.h;
                                            d89Var2.i(szbVar57 != null ? szbVar57.c(xzbVar2, dr9Var2) : ja8Var);
                                            szb szbVar58 = uq9Var2.n;
                                            d89Var2.i(szbVar58 != null ? szbVar58.c(xzbVar2, dr9Var2) : ja8Var);
                                            szb szbVar59 = uq9Var2.o;
                                            d89Var2.i(szbVar59 != null ? szbVar59.c(xzbVar2, dr9Var2) : ja8Var);
                                            szb szbVar60 = uq9Var2.r;
                                            d89Var2.i(szbVar60 != null ? szbVar60.c(xzbVar2, dr9Var2) : ja8Var);
                                            szb szbVar61 = uq9Var2.s;
                                            d89Var2.i(szbVar61 != null ? szbVar61.c(xzbVar2, dr9Var2) : ja8Var);
                                            szb szbVar62 = uq9Var2.u;
                                            d89Var2.i(szbVar62 != null ? szbVar62.c(xzbVar2, dr9Var2) : ja8Var);
                                            szb szbVar63 = uq9Var2.v;
                                            d89Var2.i(szbVar63 != null ? szbVar63.c(xzbVar2, dr9Var2) : ja8Var);
                                            cs9 cs9Var2 = uq9Var2.c;
                                            Object a3 = cs9Var2 != null ? cs9Var2.a() : ja8Var;
                                            if (a3 instanceof xl9) {
                                                d89Var2.i(((xl9) a3).a.c(xzbVar2, dr9Var2));
                                            }
                                            ts9 ts9Var2 = uq9Var2.p;
                                            Object a4 = ts9Var2 != null ? ts9Var2.a() : ja8Var;
                                            if (a4 instanceof it9) {
                                                it9 it9Var2 = (it9) a4;
                                                d89Var2.i(it9Var2.b.c(xzbVar2, dr9Var2));
                                                d89Var2.i(it9Var2.a.c(xzbVar2, dr9Var2));
                                            } else if (a4 instanceof ct9) {
                                                ct9 ct9Var2 = (ct9) a4;
                                                jz8 jz8Var3 = ct9Var2.e;
                                                d89Var2.i(ct9Var2.d.c(xzbVar2, dr9Var2));
                                                d89Var2.i(ct9Var2.a.c(xzbVar2, dr9Var2));
                                                d89Var2.i(ct9Var2.b.c(xzbVar2, dr9Var2));
                                                d89Var2.i(ct9Var2.c.c(xzbVar2, dr9Var2));
                                                d89Var2.i(jz8Var3.b.c(xzbVar2, dr9Var2));
                                                d89Var2.i(jz8Var3.a.c(xzbVar2, dr9Var2));
                                            }
                                            d89Var2.i((js9Var2 == null || (ln9Var4 = js9Var2.b) == null || (szbVar13 = ln9Var4.a) == null) ? ja8Var : szbVar13.c(xzbVar2, dr9Var2));
                                            d89Var2.i((js9Var2 == null || (ln9Var3 = js9Var2.b) == null || (szbVar12 = ln9Var3.d) == null) ? ja8Var : szbVar12.c(xzbVar2, dr9Var2));
                                            if (woe.m()) {
                                                szb szbVar64 = uq9Var2.k;
                                                d89Var2.i(szbVar64 != null ? szbVar64.c(xzbVar2, dr9Var2) : ja8Var);
                                            }
                                        }
                                    }
                                    List<tq9> list10 = pq9Var.b;
                                    if (list10 != null) {
                                        for (tq9 tq9Var2 : list10) {
                                            szb szbVar65 = tq9Var2.f;
                                            jz8 jz8Var4 = tq9Var2.j;
                                            d89Var2.i(szbVar65.c(xzbVar2, dr9Var2));
                                            d89Var2.i(tq9Var2.i.c(xzbVar2, dr9Var2));
                                            szb szbVar66 = tq9Var2.g;
                                            d89Var2.i(szbVar66 != null ? szbVar66.c(xzbVar2, dr9Var2) : ja8Var);
                                            d89Var2.i(jz8Var4.b.c(xzbVar2, dr9Var2));
                                            d89Var2.i(jz8Var4.a.c(xzbVar2, dr9Var2));
                                        }
                                    }
                                    szbVar14 = xq9Var4.i;
                                    szbVar15 = xq9Var4.k0;
                                    if (xp3.B(szbVar14, xq9Var7 == null ? xq9Var7.i : ja8Var)) {
                                    }
                                    H(d89Var2, xq9Var4, xzbVar);
                                    if (xp3.V(szbVar14)) {
                                    }
                                    er9Var2 = this;
                                    xzbVar3 = xzbVar;
                                    br9 br9Var32 = new br9(er9Var2, d89Var2, xq9Var4, xzbVar3, 0);
                                    xq9Var5 = xq9Var4;
                                    if (szbVar14 != null) {
                                    }
                                    d89Var2.i(szbVar15.c(xzbVar3, br9Var32));
                                    jr9Var = xq9Var5.a0;
                                    if (jr9Var == null) {
                                    }
                                    dj9Var = xq9Var5.b0;
                                    if (xp3.B(dj9Var != null ? dj9Var.a : shader, (xq9Var7 != null || (dj9Var7 = xq9Var7.b0) == null) ? shader : dj9Var7.a)) {
                                    }
                                    dj9 dj9Var822 = xq9Var5.b0;
                                    DisplayMetrics displayMetrics222 = d89Var2.getResources().getDisplayMetrics();
                                    S(d89Var2, dj9Var822 != null ? U(dj9Var822, xzbVar3, displayMetrics222, ((Number) szbVar28.a(xzbVar3)).intValue()) : shader);
                                    if (xp3.V(dj9Var != null ? dj9Var.a : shader)) {
                                    }
                                    er9 er9Var422 = this;
                                    xq9 xq9Var922 = xq9Var5;
                                    ii iiVar422 = new ii(er9Var422, d89Var2, dj9Var822, xzbVar3, displayMetrics222, xq9Var922, 21);
                                    xq9 xq9Var1022 = xq9Var922;
                                    d89Var2.i((dj9Var822 != null || (szbVar22 = dj9Var822.a) == null) ? shader : szbVar22.c(xzbVar3, iiVar422));
                                    d89Var2.i((dj9Var822 != null || (szbVar21 = dj9Var822.c) == null) ? shader : szbVar21.c(xzbVar3, iiVar422));
                                    d89Var2.i((dj9Var822 != null || (szbVar20 = dj9Var822.b) == null) ? shader : szbVar20.c(xzbVar3, iiVar422));
                                    d89Var2.i((dj9Var822 != null || (bf9Var4 = dj9Var822.d) == null || (ow8Var4 = bf9Var4.a) == null || (szbVar19 = ow8Var4.b) == null) ? shader : szbVar19.c(xzbVar3, iiVar422));
                                    d89Var2.i((dj9Var822 != null || (bf9Var3 = dj9Var822.d) == null || (ow8Var3 = bf9Var3.a) == null || (szbVar18 = ow8Var3.a) == null) ? shader : szbVar18.c(xzbVar3, iiVar422));
                                    d89Var2.i((dj9Var822 != null || (bf9Var2 = dj9Var822.d) == null || (ow8Var2 = bf9Var2.b) == null || (szbVar17 = ow8Var2.b) == null) ? shader : szbVar17.c(xzbVar3, iiVar422));
                                    d89Var2.i((dj9Var822 != null || (bf9Var = dj9Var822.d) == null || (ow8Var = bf9Var.b) == null || (szbVar16 = ow8Var.a) == null) ? shader : szbVar16.c(xzbVar3, iiVar422));
                                    szbVar23 = xq9Var1022.T;
                                    if (!xp3.B(szbVar23, xq9Var7 != null ? xq9Var7.T : shader)) {
                                    }
                                    szbVar24 = xq9Var1022.c0;
                                    if (!xp3.B(szbVar24, xq9Var7 != null ? xq9Var7.c0 : shader)) {
                                    }
                                    d89Var2.setFocusable((d89Var2.isFocusable() && szbVar2 == null) ? false : true);
                                }
                                xq9Var4 = xq9Var3;
                                szbVar14 = xq9Var4.i;
                                szbVar15 = xq9Var4.k0;
                                if (xp3.B(szbVar14, xq9Var7 == null ? xq9Var7.i : ja8Var)) {
                                }
                                H(d89Var2, xq9Var4, xzbVar);
                                if (xp3.V(szbVar14)) {
                                }
                                er9Var2 = this;
                                xzbVar3 = xzbVar;
                                br9 br9Var322 = new br9(er9Var2, d89Var2, xq9Var4, xzbVar3, 0);
                                xq9Var5 = xq9Var4;
                                if (szbVar14 != null) {
                                }
                                d89Var2.i(szbVar15.c(xzbVar3, br9Var322));
                                jr9Var = xq9Var5.a0;
                                if (jr9Var == null) {
                                }
                                dj9Var = xq9Var5.b0;
                                if (xp3.B(dj9Var != null ? dj9Var.a : shader, (xq9Var7 != null || (dj9Var7 = xq9Var7.b0) == null) ? shader : dj9Var7.a)) {
                                }
                                dj9 dj9Var8222 = xq9Var5.b0;
                                DisplayMetrics displayMetrics2222 = d89Var2.getResources().getDisplayMetrics();
                                S(d89Var2, dj9Var8222 != null ? U(dj9Var8222, xzbVar3, displayMetrics2222, ((Number) szbVar28.a(xzbVar3)).intValue()) : shader);
                                if (xp3.V(dj9Var != null ? dj9Var.a : shader)) {
                                }
                                er9 er9Var4222 = this;
                                xq9 xq9Var9222 = xq9Var5;
                                ii iiVar4222 = new ii(er9Var4222, d89Var2, dj9Var8222, xzbVar3, displayMetrics2222, xq9Var9222, 21);
                                xq9 xq9Var10222 = xq9Var9222;
                                d89Var2.i((dj9Var8222 != null || (szbVar22 = dj9Var8222.a) == null) ? shader : szbVar22.c(xzbVar3, iiVar4222));
                                d89Var2.i((dj9Var8222 != null || (szbVar21 = dj9Var8222.c) == null) ? shader : szbVar21.c(xzbVar3, iiVar4222));
                                d89Var2.i((dj9Var8222 != null || (szbVar20 = dj9Var8222.b) == null) ? shader : szbVar20.c(xzbVar3, iiVar4222));
                                d89Var2.i((dj9Var8222 != null || (bf9Var4 = dj9Var8222.d) == null || (ow8Var4 = bf9Var4.a) == null || (szbVar19 = ow8Var4.b) == null) ? shader : szbVar19.c(xzbVar3, iiVar4222));
                                d89Var2.i((dj9Var8222 != null || (bf9Var3 = dj9Var8222.d) == null || (ow8Var3 = bf9Var3.a) == null || (szbVar18 = ow8Var3.a) == null) ? shader : szbVar18.c(xzbVar3, iiVar4222));
                                d89Var2.i((dj9Var8222 != null || (bf9Var2 = dj9Var8222.d) == null || (ow8Var2 = bf9Var2.b) == null || (szbVar17 = ow8Var2.b) == null) ? shader : szbVar17.c(xzbVar3, iiVar4222));
                                d89Var2.i((dj9Var8222 != null || (bf9Var = dj9Var8222.d) == null || (ow8Var = bf9Var.b) == null || (szbVar16 = ow8Var.a) == null) ? shader : szbVar16.c(xzbVar3, iiVar4222));
                                szbVar23 = xq9Var10222.T;
                                if (!xp3.B(szbVar23, xq9Var7 != null ? xq9Var7.T : shader)) {
                                }
                                szbVar24 = xq9Var10222.c0;
                                if (!xp3.B(szbVar24, xq9Var7 != null ? xq9Var7.c0 : shader)) {
                                }
                                d89Var2.setFocusable((d89Var2.isFocusable() && szbVar2 == null) ? false : true);
                            }
                        }
                        gc8Var = gc8Var3;
                        K(d89Var2, gc8Var, szbVar5 == null ? (Long) szbVar5.a(xzbVar6) : null, szbVar6 == null ? (Long) szbVar6.a(xzbVar6) : null);
                        if (xp3.V(szbVar5) || !xp3.V(szbVar6)) {
                            xq9Var3 = xq9Var2;
                            e23Var2 = e23Var;
                            ak0 ak0Var = new ak0(er9Var, d89Var2, e23Var2, xq9Var3, xzbVar6, 13);
                            xzbVar = xzbVar6;
                            d89Var2.i(szbVar5 == null ? szbVar5.c(xzbVar, ak0Var) : null);
                            d89Var2.i(szbVar6 == null ? szbVar6.c(xzbVar, ak0Var) : null);
                            szbVar7 = xq9Var3.I;
                            szbVar8 = xq9Var3.w;
                            szbVar9 = xq9Var3.W;
                            list = xq9Var3.F;
                            if (list4 == null) {
                            }
                            ja8Var = null;
                            er9Var.O(d89Var2, e23Var2, xq9Var3);
                            xzbVar2 = xzbVar5;
                            er9Var.I(d89Var2, (String) szbVar9.a(xzbVar2));
                            d89Var2.i(szbVar9.c(xzbVar2, new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 1)));
                            er9Var = this;
                            e23Var2 = e23Var;
                            dr9 dr9Var3 = new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 2);
                            d89Var2.i(xq9Var3.v.c(xzbVar2, dr9Var3));
                            d89Var2.i(szbVar8.c(xzbVar2, dr9Var3));
                            szb szbVar312 = xq9Var3.t;
                            d89Var2.i(szbVar312 == null ? szbVar312.c(xzbVar2, dr9Var3) : null);
                            d89Var2.i(szbVar7 == null ? szbVar7.c(xzbVar2, dr9Var3) : null);
                            if (list4 != null) {
                            }
                            list2 = list;
                            if (list2 != null) {
                            }
                            if ((pq9Var == null ? pq9Var.c : ja8Var) == null) {
                            }
                            er9Var.N(d89Var2, e23Var2, xq9Var3);
                            if (pq9Var != null) {
                            }
                            xq9Var4 = xq9Var3;
                            szbVar14 = xq9Var4.i;
                            szbVar15 = xq9Var4.k0;
                            if (xp3.B(szbVar14, xq9Var7 == null ? xq9Var7.i : ja8Var)) {
                            }
                            H(d89Var2, xq9Var4, xzbVar);
                            if (xp3.V(szbVar14)) {
                            }
                            er9Var2 = this;
                            xzbVar3 = xzbVar;
                            br9 br9Var3222 = new br9(er9Var2, d89Var2, xq9Var4, xzbVar3, 0);
                            xq9Var5 = xq9Var4;
                            if (szbVar14 != null) {
                            }
                            d89Var2.i(szbVar15.c(xzbVar3, br9Var3222));
                            jr9Var = xq9Var5.a0;
                            if (jr9Var == null) {
                            }
                            dj9Var = xq9Var5.b0;
                            if (xp3.B(dj9Var != null ? dj9Var.a : shader, (xq9Var7 != null || (dj9Var7 = xq9Var7.b0) == null) ? shader : dj9Var7.a)) {
                            }
                            dj9 dj9Var82222 = xq9Var5.b0;
                            DisplayMetrics displayMetrics22222 = d89Var2.getResources().getDisplayMetrics();
                            S(d89Var2, dj9Var82222 != null ? U(dj9Var82222, xzbVar3, displayMetrics22222, ((Number) szbVar28.a(xzbVar3)).intValue()) : shader);
                            if (xp3.V(dj9Var != null ? dj9Var.a : shader)) {
                            }
                            er9 er9Var42222 = this;
                            xq9 xq9Var92222 = xq9Var5;
                            ii iiVar42222 = new ii(er9Var42222, d89Var2, dj9Var82222, xzbVar3, displayMetrics22222, xq9Var92222, 21);
                            xq9 xq9Var102222 = xq9Var92222;
                            d89Var2.i((dj9Var82222 != null || (szbVar22 = dj9Var82222.a) == null) ? shader : szbVar22.c(xzbVar3, iiVar42222));
                            d89Var2.i((dj9Var82222 != null || (szbVar21 = dj9Var82222.c) == null) ? shader : szbVar21.c(xzbVar3, iiVar42222));
                            d89Var2.i((dj9Var82222 != null || (szbVar20 = dj9Var82222.b) == null) ? shader : szbVar20.c(xzbVar3, iiVar42222));
                            d89Var2.i((dj9Var82222 != null || (bf9Var4 = dj9Var82222.d) == null || (ow8Var4 = bf9Var4.a) == null || (szbVar19 = ow8Var4.b) == null) ? shader : szbVar19.c(xzbVar3, iiVar42222));
                            d89Var2.i((dj9Var82222 != null || (bf9Var3 = dj9Var82222.d) == null || (ow8Var3 = bf9Var3.a) == null || (szbVar18 = ow8Var3.a) == null) ? shader : szbVar18.c(xzbVar3, iiVar42222));
                            d89Var2.i((dj9Var82222 != null || (bf9Var2 = dj9Var82222.d) == null || (ow8Var2 = bf9Var2.b) == null || (szbVar17 = ow8Var2.b) == null) ? shader : szbVar17.c(xzbVar3, iiVar42222));
                            d89Var2.i((dj9Var82222 != null || (bf9Var = dj9Var82222.d) == null || (ow8Var = bf9Var.b) == null || (szbVar16 = ow8Var.a) == null) ? shader : szbVar16.c(xzbVar3, iiVar42222));
                            szbVar23 = xq9Var102222.T;
                            if (!xp3.B(szbVar23, xq9Var7 != null ? xq9Var7.T : shader)) {
                            }
                            szbVar24 = xq9Var102222.c0;
                            if (!xp3.B(szbVar24, xq9Var7 != null ? xq9Var7.c0 : shader)) {
                            }
                            d89Var2.setFocusable((d89Var2.isFocusable() && szbVar2 == null) ? false : true);
                        }
                        xzbVar = xzbVar6;
                        xq9Var3 = xq9Var2;
                        e23Var2 = e23Var;
                        szbVar7 = xq9Var3.I;
                        szbVar8 = xq9Var3.w;
                        szbVar9 = xq9Var3.W;
                        list = xq9Var3.F;
                        if (list4 == null) {
                        }
                        ja8Var = null;
                        er9Var.O(d89Var2, e23Var2, xq9Var3);
                        xzbVar2 = xzbVar5;
                        er9Var.I(d89Var2, (String) szbVar9.a(xzbVar2));
                        d89Var2.i(szbVar9.c(xzbVar2, new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 1)));
                        er9Var = this;
                        e23Var2 = e23Var;
                        dr9 dr9Var32 = new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 2);
                        d89Var2.i(xq9Var3.v.c(xzbVar2, dr9Var32));
                        d89Var2.i(szbVar8.c(xzbVar2, dr9Var32));
                        szb szbVar3122 = xq9Var3.t;
                        d89Var2.i(szbVar3122 == null ? szbVar3122.c(xzbVar2, dr9Var32) : null);
                        d89Var2.i(szbVar7 == null ? szbVar7.c(xzbVar2, dr9Var32) : null);
                        if (list4 != null) {
                        }
                        list2 = list;
                        if (list2 != null) {
                        }
                        if ((pq9Var == null ? pq9Var.c : ja8Var) == null) {
                        }
                        er9Var.N(d89Var2, e23Var2, xq9Var3);
                        if (pq9Var != null) {
                        }
                        xq9Var4 = xq9Var3;
                        szbVar14 = xq9Var4.i;
                        szbVar15 = xq9Var4.k0;
                        if (xp3.B(szbVar14, xq9Var7 == null ? xq9Var7.i : ja8Var)) {
                        }
                        H(d89Var2, xq9Var4, xzbVar);
                        if (xp3.V(szbVar14)) {
                        }
                        er9Var2 = this;
                        xzbVar3 = xzbVar;
                        br9 br9Var32222 = new br9(er9Var2, d89Var2, xq9Var4, xzbVar3, 0);
                        xq9Var5 = xq9Var4;
                        if (szbVar14 != null) {
                        }
                        d89Var2.i(szbVar15.c(xzbVar3, br9Var32222));
                        jr9Var = xq9Var5.a0;
                        if (jr9Var == null) {
                        }
                        dj9Var = xq9Var5.b0;
                        if (xp3.B(dj9Var != null ? dj9Var.a : shader, (xq9Var7 != null || (dj9Var7 = xq9Var7.b0) == null) ? shader : dj9Var7.a)) {
                        }
                        dj9 dj9Var822222 = xq9Var5.b0;
                        DisplayMetrics displayMetrics222222 = d89Var2.getResources().getDisplayMetrics();
                        S(d89Var2, dj9Var822222 != null ? U(dj9Var822222, xzbVar3, displayMetrics222222, ((Number) szbVar28.a(xzbVar3)).intValue()) : shader);
                        if (xp3.V(dj9Var != null ? dj9Var.a : shader)) {
                        }
                        er9 er9Var422222 = this;
                        xq9 xq9Var922222 = xq9Var5;
                        ii iiVar422222 = new ii(er9Var422222, d89Var2, dj9Var822222, xzbVar3, displayMetrics222222, xq9Var922222, 21);
                        xq9 xq9Var1022222 = xq9Var922222;
                        d89Var2.i((dj9Var822222 != null || (szbVar22 = dj9Var822222.a) == null) ? shader : szbVar22.c(xzbVar3, iiVar422222));
                        d89Var2.i((dj9Var822222 != null || (szbVar21 = dj9Var822222.c) == null) ? shader : szbVar21.c(xzbVar3, iiVar422222));
                        d89Var2.i((dj9Var822222 != null || (szbVar20 = dj9Var822222.b) == null) ? shader : szbVar20.c(xzbVar3, iiVar422222));
                        d89Var2.i((dj9Var822222 != null || (bf9Var4 = dj9Var822222.d) == null || (ow8Var4 = bf9Var4.a) == null || (szbVar19 = ow8Var4.b) == null) ? shader : szbVar19.c(xzbVar3, iiVar422222));
                        d89Var2.i((dj9Var822222 != null || (bf9Var3 = dj9Var822222.d) == null || (ow8Var3 = bf9Var3.a) == null || (szbVar18 = ow8Var3.a) == null) ? shader : szbVar18.c(xzbVar3, iiVar422222));
                        d89Var2.i((dj9Var822222 != null || (bf9Var2 = dj9Var822222.d) == null || (ow8Var2 = bf9Var2.b) == null || (szbVar17 = ow8Var2.b) == null) ? shader : szbVar17.c(xzbVar3, iiVar422222));
                        d89Var2.i((dj9Var822222 != null || (bf9Var = dj9Var822222.d) == null || (ow8Var = bf9Var.b) == null || (szbVar16 = ow8Var.a) == null) ? shader : szbVar16.c(xzbVar3, iiVar422222));
                        szbVar23 = xq9Var1022222.T;
                        if (!xp3.B(szbVar23, xq9Var7 != null ? xq9Var7.T : shader)) {
                        }
                        szbVar24 = xq9Var1022222.c0;
                        if (!xp3.B(szbVar24, xq9Var7 != null ? xq9Var7.c0 : shader)) {
                        }
                        d89Var2.setFocusable((d89Var2.isFocusable() && szbVar2 == null) ? false : true);
                    }
                    er9Var = this;
                    szbVar3 = xq9Var2.l0;
                    if (!xp3.B(szbVar3, xq9Var7 == null ? xq9Var7.l0 : null)) {
                    }
                    szbVar4 = xq9Var2.V;
                    if (!xp3.B(szbVar4, xq9Var7 == null ? xq9Var7.V : null)) {
                    }
                    szbVar5 = xq9Var2.L;
                    szbVar6 = xq9Var2.M;
                    if (xp3.B(szbVar5, xq9Var7 == null ? xq9Var7.L : null)) {
                    }
                    gc8Var = gc8Var3;
                    K(d89Var2, gc8Var, szbVar5 == null ? (Long) szbVar5.a(xzbVar6) : null, szbVar6 == null ? (Long) szbVar6.a(xzbVar6) : null);
                    if (xp3.V(szbVar5)) {
                    }
                    xq9Var3 = xq9Var2;
                    e23Var2 = e23Var;
                    ak0 ak0Var2 = new ak0(er9Var, d89Var2, e23Var2, xq9Var3, xzbVar6, 13);
                    xzbVar = xzbVar6;
                    d89Var2.i(szbVar5 == null ? szbVar5.c(xzbVar, ak0Var2) : null);
                    d89Var2.i(szbVar6 == null ? szbVar6.c(xzbVar, ak0Var2) : null);
                    szbVar7 = xq9Var3.I;
                    szbVar8 = xq9Var3.w;
                    szbVar9 = xq9Var3.W;
                    list = xq9Var3.F;
                    if (list4 == null) {
                    }
                    ja8Var = null;
                    er9Var.O(d89Var2, e23Var2, xq9Var3);
                    xzbVar2 = xzbVar5;
                    er9Var.I(d89Var2, (String) szbVar9.a(xzbVar2));
                    d89Var2.i(szbVar9.c(xzbVar2, new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 1)));
                    er9Var = this;
                    e23Var2 = e23Var;
                    dr9 dr9Var322 = new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 2);
                    d89Var2.i(xq9Var3.v.c(xzbVar2, dr9Var322));
                    d89Var2.i(szbVar8.c(xzbVar2, dr9Var322));
                    szb szbVar31222 = xq9Var3.t;
                    d89Var2.i(szbVar31222 == null ? szbVar31222.c(xzbVar2, dr9Var322) : null);
                    d89Var2.i(szbVar7 == null ? szbVar7.c(xzbVar2, dr9Var322) : null);
                    if (list4 != null) {
                    }
                    list2 = list;
                    if (list2 != null) {
                    }
                    if ((pq9Var == null ? pq9Var.c : ja8Var) == null) {
                    }
                    er9Var.N(d89Var2, e23Var2, xq9Var3);
                    if (pq9Var != null) {
                    }
                    xq9Var4 = xq9Var3;
                    szbVar14 = xq9Var4.i;
                    szbVar15 = xq9Var4.k0;
                    if (xp3.B(szbVar14, xq9Var7 == null ? xq9Var7.i : ja8Var)) {
                    }
                    H(d89Var2, xq9Var4, xzbVar);
                    if (xp3.V(szbVar14)) {
                    }
                    er9Var2 = this;
                    xzbVar3 = xzbVar;
                    br9 br9Var322222 = new br9(er9Var2, d89Var2, xq9Var4, xzbVar3, 0);
                    xq9Var5 = xq9Var4;
                    if (szbVar14 != null) {
                    }
                    d89Var2.i(szbVar15.c(xzbVar3, br9Var322222));
                    jr9Var = xq9Var5.a0;
                    if (jr9Var == null) {
                    }
                    dj9Var = xq9Var5.b0;
                    if (xp3.B(dj9Var != null ? dj9Var.a : shader, (xq9Var7 != null || (dj9Var7 = xq9Var7.b0) == null) ? shader : dj9Var7.a)) {
                    }
                    dj9 dj9Var8222222 = xq9Var5.b0;
                    DisplayMetrics displayMetrics2222222 = d89Var2.getResources().getDisplayMetrics();
                    S(d89Var2, dj9Var8222222 != null ? U(dj9Var8222222, xzbVar3, displayMetrics2222222, ((Number) szbVar28.a(xzbVar3)).intValue()) : shader);
                    if (xp3.V(dj9Var != null ? dj9Var.a : shader)) {
                    }
                    er9 er9Var4222222 = this;
                    xq9 xq9Var9222222 = xq9Var5;
                    ii iiVar4222222 = new ii(er9Var4222222, d89Var2, dj9Var8222222, xzbVar3, displayMetrics2222222, xq9Var9222222, 21);
                    xq9 xq9Var10222222 = xq9Var9222222;
                    d89Var2.i((dj9Var8222222 != null || (szbVar22 = dj9Var8222222.a) == null) ? shader : szbVar22.c(xzbVar3, iiVar4222222));
                    d89Var2.i((dj9Var8222222 != null || (szbVar21 = dj9Var8222222.c) == null) ? shader : szbVar21.c(xzbVar3, iiVar4222222));
                    d89Var2.i((dj9Var8222222 != null || (szbVar20 = dj9Var8222222.b) == null) ? shader : szbVar20.c(xzbVar3, iiVar4222222));
                    d89Var2.i((dj9Var8222222 != null || (bf9Var4 = dj9Var8222222.d) == null || (ow8Var4 = bf9Var4.a) == null || (szbVar19 = ow8Var4.b) == null) ? shader : szbVar19.c(xzbVar3, iiVar4222222));
                    d89Var2.i((dj9Var8222222 != null || (bf9Var3 = dj9Var8222222.d) == null || (ow8Var3 = bf9Var3.a) == null || (szbVar18 = ow8Var3.a) == null) ? shader : szbVar18.c(xzbVar3, iiVar4222222));
                    d89Var2.i((dj9Var8222222 != null || (bf9Var2 = dj9Var8222222.d) == null || (ow8Var2 = bf9Var2.b) == null || (szbVar17 = ow8Var2.b) == null) ? shader : szbVar17.c(xzbVar3, iiVar4222222));
                    d89Var2.i((dj9Var8222222 != null || (bf9Var = dj9Var8222222.d) == null || (ow8Var = bf9Var.b) == null || (szbVar16 = ow8Var.a) == null) ? shader : szbVar16.c(xzbVar3, iiVar4222222));
                    szbVar23 = xq9Var10222222.T;
                    if (!xp3.B(szbVar23, xq9Var7 != null ? xq9Var7.T : shader)) {
                    }
                    szbVar24 = xq9Var10222222.c0;
                    if (!xp3.B(szbVar24, xq9Var7 != null ? xq9Var7.c0 : shader)) {
                    }
                    d89Var2.setFocusable((d89Var2.isFocusable() && szbVar2 == null) ? false : true);
                }
            }
            xq9Var2 = xq9Var;
            if (xp3.B(szbVar28, xq9Var7 != null ? xq9Var7.Z : null)) {
            }
            R(d89Var2, ((Number) szbVar28.a(xzbVar6)).intValue(), szbVar2 != null ? (Integer) szbVar2.a(xzbVar6) : null);
            if (szbVar28 instanceof ozb) {
            }
            er9Var = this;
            br9 br9Var22 = new br9(er9Var, d89Var2, xq9Var2, xzbVar6, 3);
            d89Var2.i(szbVar28.c(xzbVar6, br9Var22));
            d89Var2.i(szbVar2 != null ? szbVar2.c(xzbVar6, br9Var22) : null);
            szbVar3 = xq9Var2.l0;
            if (!xp3.B(szbVar3, xq9Var7 == null ? xq9Var7.l0 : null)) {
            }
            szbVar4 = xq9Var2.V;
            if (!xp3.B(szbVar4, xq9Var7 == null ? xq9Var7.V : null)) {
            }
            szbVar5 = xq9Var2.L;
            szbVar6 = xq9Var2.M;
            if (xp3.B(szbVar5, xq9Var7 == null ? xq9Var7.L : null)) {
            }
            gc8Var = gc8Var3;
            K(d89Var2, gc8Var, szbVar5 == null ? (Long) szbVar5.a(xzbVar6) : null, szbVar6 == null ? (Long) szbVar6.a(xzbVar6) : null);
            if (xp3.V(szbVar5)) {
            }
            xq9Var3 = xq9Var2;
            e23Var2 = e23Var;
            ak0 ak0Var22 = new ak0(er9Var, d89Var2, e23Var2, xq9Var3, xzbVar6, 13);
            xzbVar = xzbVar6;
            d89Var2.i(szbVar5 == null ? szbVar5.c(xzbVar, ak0Var22) : null);
            d89Var2.i(szbVar6 == null ? szbVar6.c(xzbVar, ak0Var22) : null);
            szbVar7 = xq9Var3.I;
            szbVar8 = xq9Var3.w;
            szbVar9 = xq9Var3.W;
            list = xq9Var3.F;
            if (list4 == null) {
            }
            ja8Var = null;
            er9Var.O(d89Var2, e23Var2, xq9Var3);
            xzbVar2 = xzbVar5;
            er9Var.I(d89Var2, (String) szbVar9.a(xzbVar2));
            d89Var2.i(szbVar9.c(xzbVar2, new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 1)));
            er9Var = this;
            e23Var2 = e23Var;
            dr9 dr9Var3222 = new dr9(er9Var, d89Var2, e23Var2, xq9Var3, 2);
            d89Var2.i(xq9Var3.v.c(xzbVar2, dr9Var3222));
            d89Var2.i(szbVar8.c(xzbVar2, dr9Var3222));
            szb szbVar312222 = xq9Var3.t;
            d89Var2.i(szbVar312222 == null ? szbVar312222.c(xzbVar2, dr9Var3222) : null);
            d89Var2.i(szbVar7 == null ? szbVar7.c(xzbVar2, dr9Var3222) : null);
            if (list4 != null) {
            }
            list2 = list;
            if (list2 != null) {
            }
            if ((pq9Var == null ? pq9Var.c : ja8Var) == null) {
            }
            er9Var.N(d89Var2, e23Var2, xq9Var3);
            if (pq9Var != null) {
            }
            xq9Var4 = xq9Var3;
            szbVar14 = xq9Var4.i;
            szbVar15 = xq9Var4.k0;
            if (xp3.B(szbVar14, xq9Var7 == null ? xq9Var7.i : ja8Var)) {
            }
            H(d89Var2, xq9Var4, xzbVar);
            if (xp3.V(szbVar14)) {
            }
            er9Var2 = this;
            xzbVar3 = xzbVar;
            br9 br9Var3222222 = new br9(er9Var2, d89Var2, xq9Var4, xzbVar3, 0);
            xq9Var5 = xq9Var4;
            if (szbVar14 != null) {
            }
            d89Var2.i(szbVar15.c(xzbVar3, br9Var3222222));
            jr9Var = xq9Var5.a0;
            if (jr9Var == null) {
            }
            dj9Var = xq9Var5.b0;
            if (xp3.B(dj9Var != null ? dj9Var.a : shader, (xq9Var7 != null || (dj9Var7 = xq9Var7.b0) == null) ? shader : dj9Var7.a)) {
            }
            dj9 dj9Var82222222 = xq9Var5.b0;
            DisplayMetrics displayMetrics22222222 = d89Var2.getResources().getDisplayMetrics();
            S(d89Var2, dj9Var82222222 != null ? U(dj9Var82222222, xzbVar3, displayMetrics22222222, ((Number) szbVar28.a(xzbVar3)).intValue()) : shader);
            if (xp3.V(dj9Var != null ? dj9Var.a : shader)) {
            }
            er9 er9Var42222222 = this;
            xq9 xq9Var92222222 = xq9Var5;
            ii iiVar42222222 = new ii(er9Var42222222, d89Var2, dj9Var82222222, xzbVar3, displayMetrics22222222, xq9Var92222222, 21);
            xq9 xq9Var102222222 = xq9Var92222222;
            d89Var2.i((dj9Var82222222 != null || (szbVar22 = dj9Var82222222.a) == null) ? shader : szbVar22.c(xzbVar3, iiVar42222222));
            d89Var2.i((dj9Var82222222 != null || (szbVar21 = dj9Var82222222.c) == null) ? shader : szbVar21.c(xzbVar3, iiVar42222222));
            d89Var2.i((dj9Var82222222 != null || (szbVar20 = dj9Var82222222.b) == null) ? shader : szbVar20.c(xzbVar3, iiVar42222222));
            d89Var2.i((dj9Var82222222 != null || (bf9Var4 = dj9Var82222222.d) == null || (ow8Var4 = bf9Var4.a) == null || (szbVar19 = ow8Var4.b) == null) ? shader : szbVar19.c(xzbVar3, iiVar42222222));
            d89Var2.i((dj9Var82222222 != null || (bf9Var3 = dj9Var82222222.d) == null || (ow8Var3 = bf9Var3.a) == null || (szbVar18 = ow8Var3.a) == null) ? shader : szbVar18.c(xzbVar3, iiVar42222222));
            d89Var2.i((dj9Var82222222 != null || (bf9Var2 = dj9Var82222222.d) == null || (ow8Var2 = bf9Var2.b) == null || (szbVar17 = ow8Var2.b) == null) ? shader : szbVar17.c(xzbVar3, iiVar42222222));
            d89Var2.i((dj9Var82222222 != null || (bf9Var = dj9Var82222222.d) == null || (ow8Var = bf9Var.b) == null || (szbVar16 = ow8Var.a) == null) ? shader : szbVar16.c(xzbVar3, iiVar42222222));
            szbVar23 = xq9Var102222222.T;
            if (!xp3.B(szbVar23, xq9Var7 != null ? xq9Var7.T : shader)) {
            }
            szbVar24 = xq9Var102222222.c0;
            if (!xp3.B(szbVar24, xq9Var7 != null ? xq9Var7.c0 : shader)) {
            }
            d89Var2.setFocusable((d89Var2.isFocusable() && szbVar2 == null) ? false : true);
        }
        xq9Var = xq9Var6;
        woe.r(d89Var, xq9Var.v, xq9Var.w, xq9Var7 == null ? xq9Var7.v : null, xq9Var7 == null ? xq9Var7.w : null, xzbVar6, d89Var);
        woe.s(d89Var, xq9Var.H, xq9Var.v, xq9Var7 == null ? xq9Var7.H : null, xq9Var7 == null ? xq9Var7.v : null, xzbVar6, d89Var);
        d89 d89Var22 = d89Var;
        szbVar = xq9Var.u;
        if (!xp3.B(szbVar, xq9Var7 == null ? xq9Var7.u : null)) {
        }
        xq9Var2 = xq9Var;
        if (xp3.B(szbVar28, xq9Var7 != null ? xq9Var7.Z : null)) {
        }
        R(d89Var22, ((Number) szbVar28.a(xzbVar6)).intValue(), szbVar2 != null ? (Integer) szbVar2.a(xzbVar6) : null);
        if (szbVar28 instanceof ozb) {
        }
        er9Var = this;
        br9 br9Var222 = new br9(er9Var, d89Var22, xq9Var2, xzbVar6, 3);
        d89Var22.i(szbVar28.c(xzbVar6, br9Var222));
        d89Var22.i(szbVar2 != null ? szbVar2.c(xzbVar6, br9Var222) : null);
        szbVar3 = xq9Var2.l0;
        if (!xp3.B(szbVar3, xq9Var7 == null ? xq9Var7.l0 : null)) {
        }
        szbVar4 = xq9Var2.V;
        if (!xp3.B(szbVar4, xq9Var7 == null ? xq9Var7.V : null)) {
        }
        szbVar5 = xq9Var2.L;
        szbVar6 = xq9Var2.M;
        if (xp3.B(szbVar5, xq9Var7 == null ? xq9Var7.L : null)) {
        }
        gc8Var = gc8Var3;
        K(d89Var22, gc8Var, szbVar5 == null ? (Long) szbVar5.a(xzbVar6) : null, szbVar6 == null ? (Long) szbVar6.a(xzbVar6) : null);
        if (xp3.V(szbVar5)) {
        }
        xq9Var3 = xq9Var2;
        e23Var2 = e23Var;
        ak0 ak0Var222 = new ak0(er9Var, d89Var22, e23Var2, xq9Var3, xzbVar6, 13);
        xzbVar = xzbVar6;
        d89Var22.i(szbVar5 == null ? szbVar5.c(xzbVar, ak0Var222) : null);
        d89Var22.i(szbVar6 == null ? szbVar6.c(xzbVar, ak0Var222) : null);
        szbVar7 = xq9Var3.I;
        szbVar8 = xq9Var3.w;
        szbVar9 = xq9Var3.W;
        list = xq9Var3.F;
        if (list4 == null) {
        }
        ja8Var = null;
        er9Var.O(d89Var22, e23Var2, xq9Var3);
        xzbVar2 = xzbVar5;
        er9Var.I(d89Var22, (String) szbVar9.a(xzbVar2));
        d89Var22.i(szbVar9.c(xzbVar2, new dr9(er9Var, d89Var22, e23Var2, xq9Var3, 1)));
        er9Var = this;
        e23Var2 = e23Var;
        dr9 dr9Var32222 = new dr9(er9Var, d89Var22, e23Var2, xq9Var3, 2);
        d89Var22.i(xq9Var3.v.c(xzbVar2, dr9Var32222));
        d89Var22.i(szbVar8.c(xzbVar2, dr9Var32222));
        szb szbVar3122222 = xq9Var3.t;
        d89Var22.i(szbVar3122222 == null ? szbVar3122222.c(xzbVar2, dr9Var32222) : null);
        d89Var22.i(szbVar7 == null ? szbVar7.c(xzbVar2, dr9Var32222) : null);
        if (list4 != null) {
        }
        list2 = list;
        if (list2 != null) {
        }
        if ((pq9Var == null ? pq9Var.c : ja8Var) == null) {
        }
        er9Var.N(d89Var22, e23Var2, xq9Var3);
        if (pq9Var != null) {
        }
        xq9Var4 = xq9Var3;
        szbVar14 = xq9Var4.i;
        szbVar15 = xq9Var4.k0;
        if (xp3.B(szbVar14, xq9Var7 == null ? xq9Var7.i : ja8Var)) {
        }
        H(d89Var22, xq9Var4, xzbVar);
        if (xp3.V(szbVar14)) {
        }
        er9Var2 = this;
        xzbVar3 = xzbVar;
        br9 br9Var32222222 = new br9(er9Var2, d89Var22, xq9Var4, xzbVar3, 0);
        xq9Var5 = xq9Var4;
        if (szbVar14 != null) {
        }
        d89Var22.i(szbVar15.c(xzbVar3, br9Var32222222));
        jr9Var = xq9Var5.a0;
        if (jr9Var == null) {
        }
        dj9Var = xq9Var5.b0;
        if (xp3.B(dj9Var != null ? dj9Var.a : shader, (xq9Var7 != null || (dj9Var7 = xq9Var7.b0) == null) ? shader : dj9Var7.a)) {
        }
        dj9 dj9Var822222222 = xq9Var5.b0;
        DisplayMetrics displayMetrics222222222 = d89Var22.getResources().getDisplayMetrics();
        S(d89Var22, dj9Var822222222 != null ? U(dj9Var822222222, xzbVar3, displayMetrics222222222, ((Number) szbVar28.a(xzbVar3)).intValue()) : shader);
        if (xp3.V(dj9Var != null ? dj9Var.a : shader)) {
        }
        er9 er9Var422222222 = this;
        xq9 xq9Var922222222 = xq9Var5;
        ii iiVar422222222 = new ii(er9Var422222222, d89Var22, dj9Var822222222, xzbVar3, displayMetrics222222222, xq9Var922222222, 21);
        xq9 xq9Var1022222222 = xq9Var922222222;
        d89Var22.i((dj9Var822222222 != null || (szbVar22 = dj9Var822222222.a) == null) ? shader : szbVar22.c(xzbVar3, iiVar422222222));
        d89Var22.i((dj9Var822222222 != null || (szbVar21 = dj9Var822222222.c) == null) ? shader : szbVar21.c(xzbVar3, iiVar422222222));
        d89Var22.i((dj9Var822222222 != null || (szbVar20 = dj9Var822222222.b) == null) ? shader : szbVar20.c(xzbVar3, iiVar422222222));
        d89Var22.i((dj9Var822222222 != null || (bf9Var4 = dj9Var822222222.d) == null || (ow8Var4 = bf9Var4.a) == null || (szbVar19 = ow8Var4.b) == null) ? shader : szbVar19.c(xzbVar3, iiVar422222222));
        d89Var22.i((dj9Var822222222 != null || (bf9Var3 = dj9Var822222222.d) == null || (ow8Var3 = bf9Var3.a) == null || (szbVar18 = ow8Var3.a) == null) ? shader : szbVar18.c(xzbVar3, iiVar422222222));
        d89Var22.i((dj9Var822222222 != null || (bf9Var2 = dj9Var822222222.d) == null || (ow8Var2 = bf9Var2.b) == null || (szbVar17 = ow8Var2.b) == null) ? shader : szbVar17.c(xzbVar3, iiVar422222222));
        d89Var22.i((dj9Var822222222 != null || (bf9Var = dj9Var822222222.d) == null || (ow8Var = bf9Var.b) == null || (szbVar16 = ow8Var.a) == null) ? shader : szbVar16.c(xzbVar3, iiVar422222222));
        szbVar23 = xq9Var1022222222.T;
        if (!xp3.B(szbVar23, xq9Var7 != null ? xq9Var7.T : shader)) {
        }
        szbVar24 = xq9Var1022222222.c0;
        if (!xp3.B(szbVar24, xq9Var7 != null ? xq9Var7.c0 : shader)) {
        }
        d89Var22.setFocusable((d89Var22.isFocusable() && szbVar2 == null) ? false : true);
    }
}
