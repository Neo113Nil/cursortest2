package defpackage;

import androidx.fragment.app.i;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1117l2;
import ru.kinopoisk.sdk.easylogin.internal.C1218s6;
import ru.kinopoisk.sdk.easylogin.internal.C1309z4;
import ru.kinopoisk.sdk.easylogin.internal.Z0;
import timber.log.Timber;

/* loaded from: classes5.dex */
public class fb6 extends C1309z4 {

    @NotNull
    private static final db6 Companion = new db6();

    @NotNull
    private static final String TAG = "ContainerFragmentNavigator";
    private final Function0<Unit> backParentCallback;
    private boolean isTerminated;

    @NotNull
    private final bkk pendingCommandBuffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb6(t tVar, y yVar, int i) {
        super(tVar, i, yVar, null, 8, null);
        tVar.getClass();
        yVar.getClass();
        this.backParentCallback = null;
        this.pendingCommandBuffer = ckk.a;
    }

    public static final void access$applyCommandsInternal(fb6 fb6Var, Z0[] z0Arr) {
        fb6Var.getClass();
        Timber.INSTANCE.tag(TAG).d("applyCommands: commands %s", xz0.J(z0Arr, null, new m40(24, fb6Var), 31));
        for (Z0 z0 : z0Arr) {
            try {
                y fragmentManager = fb6Var.getFragmentManager();
                fragmentManager.z(true);
                fragmentManager.E();
            } catch (IllegalStateException e) {
                Timber.INSTANCE.tag(TAG).w(e);
            }
            fb6Var.getBackStackCopy().clear();
            int H = fb6Var.getFragmentManager().H();
            for (int i = 0; i < H; i++) {
                List<String> backStackCopy = fb6Var.getBackStackCopy();
                String str = fb6Var.getFragmentManager().G(i).k;
                str.getClass();
                backStackCopy.add(str);
            }
            fb6Var.applyCommand(z0);
        }
    }

    public static final void access$executeBackCommand(fb6 fb6Var) {
        Unit unit;
        List f = fb6Var.getFragmentManager().c.f();
        f.getClass();
        o oVar = (o) CollectionsKt.Z(f);
        if (oVar instanceof i) {
            ((i) oVar).dismiss();
            return;
        }
        if (fb6Var.getBackStackCopy().size() >= 1) {
            fb6Var.getFragmentManager().T();
            z75.B(fb6Var.getBackStackCopy());
            return;
        }
        Function0<Unit> function0 = fb6Var.backParentCallback;
        if (function0 != null) {
            function0.invoke();
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            fb6Var.isTerminated = true;
            if (fb6Var.getActivity().isInPictureInPictureMode()) {
                C1117l2.b(fb6Var.getActivity());
            }
            fb6Var.getActivity().finish();
        }
    }

    public static final String access$toLogCommand(fb6 fb6Var, Z0 z0) {
        fb6Var.getClass();
        if (z0 instanceof jsc) {
            return "Forward[screen=" + ((jsc) z0).a + "]";
        }
        if (z0 instanceof aj2) {
            return "BackTo[screen=" + ((aj2) z0).a + "]";
        }
        if (!(z0 instanceof vyn)) {
            return z0.toString();
        }
        return "Replace[screen=" + ((vyn) z0).a + "]";
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.C1309z4
    public void applyCommand(@NotNull Z0 z0) {
        z0.getClass();
        C1218s6.a(new eb6(this, z0));
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.C1309z4, ru.kinopoisk.sdk.easylogin.internal.K6
    public void applyCommands(@NotNull Z0[] z0Arr) {
        z0Arr.getClass();
        C1218s6.a(new ha0(26, this, z0Arr));
    }

    public final Function0<Unit> getBackParentCallback() {
        return this.backParentCallback;
    }
}
