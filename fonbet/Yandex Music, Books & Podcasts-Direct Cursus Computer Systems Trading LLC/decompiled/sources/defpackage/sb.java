package defpackage;

import android.app.Activity;
import android.app.job.JobScheduler;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import android.window.BackEvent;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ru.yandex.music.R;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes.dex */
public abstract class sb {
    public static int A(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getSwipeEdge();
    }

    public static float B(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchX();
    }

    public static float C(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchY();
    }

    public static final Intent D(np2 np2Var, Intent intent) {
        intent.getClass();
        if (np2Var == null || !sj2.C(np2Var, intent)) {
            return intent;
        }
        np2Var.l().y(intent);
        return intent;
    }

    public static final void a(CursorAnchorInfo.Builder builder, cds cdsVar, ynn ynnVar) {
        if (ynnVar.i()) {
            return;
        }
        float f = ynnVar.b;
        ogi ogiVar = cdsVar.b;
        int f2 = ogiVar.f(f);
        int f3 = ogiVar.f(ynnVar.d);
        if (f2 > f3) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(ogiVar.g(f2), ogiVar.h(f2), cdsVar.d(f2), ogiVar.c(f2));
            if (f2 == f3) {
                return;
            } else {
                f2++;
            }
        }
    }

    public static final void b(CursorAnchorInfo.Builder builder, cds cdsVar, ynn ynnVar) {
        if (ynnVar.i()) {
            return;
        }
        float f = ynnVar.b;
        ogi ogiVar = cdsVar.b;
        int f2 = ogiVar.f(f);
        int f3 = ogiVar.f(ynnVar.d);
        if (f2 > f3) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(ogiVar.g(f2), ogiVar.h(f2), cdsVar.d(f2), ogiVar.c(f2));
            if (f2 == f3) {
                return;
            } else {
                f2++;
            }
        }
    }

    public static float c(int i, float f, DisplayMetrics displayMetrics) {
        return TypedValue.deriveDimension(i, f, displayMetrics);
    }

    public static int d(HandwritingGesture handwritingGesture, ybg ybgVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        ybgVar.invoke(new vb5(fallbackText, 1));
        return 5;
    }

    public static JobScheduler e(JobScheduler jobScheduler) {
        JobScheduler forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        forNamespace.getClass();
        return forNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction f() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float g(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int[] j(ads adsVar, RectF rectF, int i, final y5 y5Var) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = new oo0(new atn(19, adsVar.f.getText(), adsVar.j()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(adsVar.f.getText(), adsVar.a);
        }
        return adsVar.f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: ah0
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) y5.this.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static float k(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static float l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    public static int m(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int n(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static boolean o(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static final ColorSpace p(l95 l95Var) {
        if (Intrinsics.d(l95Var, n95.v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (Intrinsics.d(l95Var, n95.w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static final void q(Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            activity.overrideActivityTransition(1, 0, R.anim.slide_out_bottom);
        } else {
            activity.overridePendingTransition(0, R.anim.slide_out_bottom);
        }
    }

    public static final void r(VideoClipActivity videoClipActivity) {
        if (Build.VERSION.SDK_INT >= 34) {
            videoClipActivity.overrideActivityTransition(0, R.anim.slide_in_bottom, 0);
        } else {
            videoClipActivity.overridePendingTransition(R.anim.slide_in_bottom, 0);
        }
    }

    public static void s(long j, mn0 mn0Var, boolean z, ybg ybgVar) {
        if (z) {
            int i = rds.c;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            int codePointBefore = i2 > 0 ? Character.codePointBefore(mn0Var, i2) : 10;
            int codePointAt = i3 < mn0Var.b.length() ? Character.codePointAt(mn0Var, i3) : 10;
            if (saf.b0(codePointBefore) && (saf.a0(codePointAt) || saf.Z(codePointAt))) {
                do {
                    i2 -= Character.charCount(codePointBefore);
                    if (i2 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(mn0Var, i2);
                    }
                } while (saf.b0(codePointBefore));
                j = y5g.P(i2, i3);
            } else if (saf.b0(codePointAt) && (saf.a0(codePointBefore) || saf.Z(codePointBefore))) {
                do {
                    i3 += Character.charCount(codePointAt);
                    if (i3 == mn0Var.b.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(mn0Var, i3);
                    }
                } while (saf.b0(codePointAt));
                j = y5g.P(i2, i3);
            }
        }
        int i4 = (int) (4294967295L & j);
        ybgVar.invoke(new lsd(new i1b[]{new hop(i4, i4), new dx7(rds.c(j), 0)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int t(axf axfVar, HandwritingGesture handwritingGesture, qbs qbsVar, aeu aeuVar, ybg ybgVar) {
        long j;
        int i;
        dds d;
        dds d2;
        bds bdsVar;
        mn0 mn0Var = axfVar.j;
        if (mn0Var == null) {
            return 3;
        }
        dds d3 = axfVar.d();
        if (!mn0Var.equals((d3 == null || (bdsVar = d3.a.a) == null) ? null : bdsVar.a)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long T = saf.T(axfVar, uwf.G(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (rds.b(T)) {
                return d(selectGesture, ybgVar);
            }
            ybgVar.invoke(new hop((int) (T >> 32), (int) (T & 4294967295L)));
            if (qbsVar != null) {
                qbsVar.f(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i2 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long T2 = saf.T(axfVar, uwf.G(deleteGesture.getDeletionArea()), i2);
                if (rds.b(T2)) {
                    return d(deleteGesture, ybgVar);
                }
                s(T2, mn0Var, i2 == 1, ybgVar);
                return 1;
            }
            if (handwritingGesture instanceof SelectRangeGesture) {
                SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
                long x = saf.x(axfVar, uwf.G(selectRangeGesture.getSelectionStartArea()), uwf.G(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
                if (rds.b(x)) {
                    return d(selectRangeGesture, ybgVar);
                }
                ybgVar.invoke(new hop((int) (x >> 32), (int) (x & 4294967295L)));
                if (qbsVar != null) {
                    qbsVar.f(true);
                }
            } else {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i3 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long x2 = saf.x(axfVar, uwf.G(deleteRangeGesture.getDeletionStartArea()), uwf.G(deleteRangeGesture.getDeletionEndArea()), i3);
                    if (rds.b(x2)) {
                        return d(deleteRangeGesture, ybgVar);
                    }
                    s(x2, mn0Var, i3 == 1, ybgVar);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (aeuVar == null) {
                        return d(joinOrSplitGesture, ybgVar);
                    }
                    int w = saf.w(axfVar, saf.A(joinOrSplitGesture.getJoinOrSplitPoint()), aeuVar);
                    if (w == -1 || ((d2 = axfVar.d()) != null && saf.y(d2.a, w))) {
                        return d(joinOrSplitGesture, ybgVar);
                    }
                    int i4 = w;
                    while (i4 > 0) {
                        int codePointBefore = Character.codePointBefore(mn0Var, i4);
                        if (!saf.a0(codePointBefore)) {
                            break;
                        }
                        i4 -= Character.charCount(codePointBefore);
                    }
                    while (w < mn0Var.b.length()) {
                        int codePointAt = Character.codePointAt(mn0Var, w);
                        if (!saf.a0(codePointAt)) {
                            break;
                        }
                        w += Character.charCount(codePointAt);
                    }
                    long P = y5g.P(i4, w);
                    if (!rds.b(P)) {
                        s(P, mn0Var, false, ybgVar);
                        return 1;
                    }
                    int i5 = (int) (P >> 32);
                    ybgVar.invoke(new lsd(new i1b[]{new hop(i5, i5), new vb5(StringUtil.SPACE, 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (aeuVar == null) {
                        return d(insertGesture, ybgVar);
                    }
                    int w2 = saf.w(axfVar, saf.A(insertGesture.getInsertionPoint()), aeuVar);
                    if (w2 == -1 || ((d = axfVar.d()) != null && saf.y(d.a, w2))) {
                        return d(insertGesture, ybgVar);
                    }
                    ybgVar.invoke(new lsd(new i1b[]{new hop(w2, w2), new vb5(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                dds d4 = axfVar.d();
                cds cdsVar = d4 != null ? d4.a : null;
                long A = saf.A(removeSpaceGesture.getStartPoint());
                long A2 = saf.A(removeSpaceGesture.getEndPoint());
                wof c = axfVar.c();
                if (cdsVar != null) {
                    ogi ogiVar = cdsVar.b;
                    if (c != null) {
                        long x3 = c.x(A);
                        long x4 = c.x(A2);
                        int S = saf.S(ogiVar, x3, aeuVar);
                        int S2 = saf.S(ogiVar, x4, aeuVar);
                        if (S != -1) {
                            if (S2 != -1) {
                                S = Math.min(S, S2);
                            }
                            S2 = S;
                        } else if (S2 == -1) {
                            j = rds.b;
                            if (rds.b(j)) {
                                return d(removeSpaceGesture, ybgVar);
                            }
                            vqn vqnVar = new vqn();
                            vqnVar.a = -1;
                            vqn vqnVar2 = new vqn();
                            vqnVar2.a = -1;
                            String f = new Regex("\\s+").f(mn0Var.subSequence(rds.e(j), rds.d(j)).b, new sea(14, vqnVar, vqnVar2));
                            int i6 = vqnVar.a;
                            if (i6 == -1 || (i = vqnVar2.a) == -1) {
                                return d(removeSpaceGesture, ybgVar);
                            }
                            int i7 = (int) (j >> 32);
                            ybgVar.invoke(new lsd(new i1b[]{new hop(i7 + i6, i7 + i), new vb5(f.substring(i6, f.length() - (rds.c(j) - vqnVar2.a)), 1)}));
                            return 1;
                        }
                        float c2 = (ogiVar.c(S2) + ogiVar.h(S2)) / 2;
                        int i8 = (int) (x3 >> 32);
                        int i9 = (int) (x4 >> 32);
                        j = ogiVar.j(new ynn(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), c2 - 0.1f, Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), c2 + 0.1f), 0, bs4.k);
                        if (rds.b(j)) {
                        }
                    }
                }
                j = rds.b;
                if (rds.b(j)) {
                }
            }
        }
        return 1;
    }

    public static boolean u(axf axfVar, PreviewableHandwritingGesture previewableHandwritingGesture, qbs qbsVar, CancellationSignal cancellationSignal) {
        bds bdsVar;
        mn0 mn0Var = axfVar.j;
        if (mn0Var != null) {
            dds d = axfVar.d();
            if (mn0Var.equals((d == null || (bdsVar = d.a.a) == null) ? null : bdsVar.a)) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (qbsVar != null) {
                        long T = saf.T(axfVar, uwf.G(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        axf axfVar2 = qbsVar.d;
                        if (axfVar2 != null) {
                            axfVar2.f(T);
                        }
                        axf axfVar3 = qbsVar.d;
                        if (axfVar3 != null) {
                            axfVar3.e(rds.b);
                        }
                        if (!rds.b(T)) {
                            qbsVar.q(false);
                            qbsVar.o(zrd.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (qbsVar != null) {
                        long T2 = saf.T(axfVar, uwf.G(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        axf axfVar4 = qbsVar.d;
                        if (axfVar4 != null) {
                            axfVar4.e(T2);
                        }
                        axf axfVar5 = qbsVar.d;
                        if (axfVar5 != null) {
                            axfVar5.f(rds.b);
                        }
                        if (!rds.b(T2)) {
                            qbsVar.q(false);
                            qbsVar.o(zrd.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (qbsVar != null) {
                        long x = saf.x(axfVar, uwf.G(selectRangeGesture.getSelectionStartArea()), uwf.G(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        axf axfVar6 = qbsVar.d;
                        if (axfVar6 != null) {
                            axfVar6.f(x);
                        }
                        axf axfVar7 = qbsVar.d;
                        if (axfVar7 != null) {
                            axfVar7.e(rds.b);
                        }
                        if (!rds.b(x)) {
                            qbsVar.q(false);
                            qbsVar.o(zrd.a);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (qbsVar != null) {
                        long x2 = saf.x(axfVar, uwf.G(deleteRangeGesture.getDeletionStartArea()), uwf.G(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        axf axfVar8 = qbsVar.d;
                        if (axfVar8 != null) {
                            axfVar8.e(x2);
                        }
                        axf axfVar9 = qbsVar.d;
                        if (axfVar9 != null) {
                            axfVar9.f(rds.b);
                        }
                        if (!rds.b(x2)) {
                            qbsVar.q(false);
                            qbsVar.o(zrd.a);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new tp5(1, qbsVar));
                }
                return true;
            }
        }
        return false;
    }

    public static float v(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getProgress();
    }

    public static final float w(Integer num, DisplayMetrics displayMetrics) {
        return Build.VERSION.SDK_INT >= 34 ? TypedValue.deriveDimension(1, num.floatValue(), displayMetrics) : num.floatValue() / displayMetrics.density;
    }

    public static void x(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(u75.h(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(xz0.Y(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static void y(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void z(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }
}
