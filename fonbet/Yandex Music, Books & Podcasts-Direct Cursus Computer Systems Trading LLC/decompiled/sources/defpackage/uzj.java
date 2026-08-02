package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface uzj {
    static tzj a(uzj uzjVar, Function2 function2, c8j c8jVar, xod xodVar, boolean z, int i) {
        eqi eqiVar;
        Reference poll;
        Object obj = null;
        if ((i & 4) != 0) {
            xodVar = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) uzjVar;
        if (xodVar != null) {
            return new zod(xodVar, null, androidComposeView, function2, c8jVar);
        }
        if (z) {
            if (androidComposeView.isHardwareAccelerated() && androidComposeView.E0) {
                try {
                    return new axn(androidComposeView, function2, c8jVar);
                } catch (Throwable unused) {
                    androidComposeView.E0 = false;
                }
            }
            if (androidComposeView.J == null) {
                if (!xeu.s) {
                    neg.K(new View(androidComposeView.getContext()));
                }
                gpa gpaVar = xeu.t ? new gpa(androidComposeView.getContext()) : new zeu(androidComposeView.getContext());
                androidComposeView.J = gpaVar;
                androidComposeView.addView(gpaVar, -1);
            }
            gpa gpaVar2 = androidComposeView.J;
            gpaVar2.getClass();
            return new xeu(androidComposeView, gpaVar2, function2, c8jVar);
        }
        y8p y8pVar = androidComposeView.Z0;
        do {
            ReferenceQueue referenceQueue = (ReferenceQueue) y8pVar.c;
            eqiVar = (eqi) y8pVar.b;
            poll = referenceQueue.poll();
            if (poll != null) {
                eqiVar.l(poll);
            }
        } while (poll != null);
        while (true) {
            int i2 = eqiVar.c;
            if (i2 == 0) {
                break;
            }
            Object obj2 = ((Reference) eqiVar.m(i2 - 1)).get();
            if (obj2 != null) {
                obj = obj2;
                break;
            }
        }
        tzj tzjVar = (tzj) obj;
        if (tzjVar == null) {
            return new zod(androidComposeView.getGraphicsContext().b(), androidComposeView.getGraphicsContext(), androidComposeView, function2, c8jVar);
        }
        tzjVar.e(function2, c8jVar);
        return tzjVar;
    }

    pb getAccessibilityManager();

    fe2 getAutofill();

    le2 getAutofillManager();

    me2 getAutofillTree();

    kp4 getClipboard();

    lp4 getClipboardManager();

    CoroutineContext getCoroutineContext();

    jx7 getDensity();

    jma getDragAndDropManager();

    toc getFocusOwner();

    ppc getFontFamilyResolver();

    kpc getFontLoader();

    uod getGraphicsContext();

    msd getHapticFeedBack();

    tne getInputModeManager();

    xof getLayoutDirection();

    adi getModifierLocalManager();

    jsk getPlacementScope();

    kfm getPointerIconService();

    znn getRectManager();

    mpf getRoot();

    tfp getSemanticsOwner();

    opf getSharedDrawScope();

    boolean getShowLayoutBounds();

    wzj getSnapshotObserver();

    c3r getSoftwareKeyboardController();

    lcs getTextInputService();

    hes getTextToolbar();

    aeu getViewConfiguration();

    kpv getWindowInfo();

    void setShowLayoutBounds(boolean z);
}
