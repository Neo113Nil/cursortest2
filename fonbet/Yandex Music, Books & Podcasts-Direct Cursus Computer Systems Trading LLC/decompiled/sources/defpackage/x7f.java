package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lx7f;", "Lue3;", "", "<init>", "()V", "g8c", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public abstract class x7f extends ue3 {
    public final g8c j = new g8c(this);
    public BottomSheetBehavior k;

    public static void B(x7f x7fVar, y yVar, String str) {
        x7fVar.getClass();
        yVar.getClass();
        if (yVar.D(str) != null) {
            return;
        }
        x7fVar.show(yVar, str);
    }

    public void A(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.setPeekHeight(getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_expanded_top_margin) + getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_peekheight));
    }

    @Override // defpackage.ue3, defpackage.af3, defpackage.hr0, androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        context.getClass();
        return new m7w(context, getTheme(), new lhd(13, this));
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_juicy_catalog_menu, viewGroup);
    }

    @Override // androidx.fragment.app.o
    public void onResume() {
        Window window;
        super.onResume();
        Configuration configuration = getResources().getConfiguration();
        configuration.getClass();
        if (asq.I(configuration)) {
            Context context = getContext();
            context.getClass();
            int i = sht.b(context).widthPixels;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_max_width);
            if (i > dimensionPixelSize) {
                i = dimensionPixelSize;
            }
            Dialog dialog = getDialog();
            if (dialog == null || (window = dialog.getWindow()) == null) {
                return;
            }
            window.setLayout(i, -1);
        }
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Enum, jyd] */
    @Override // androidx.fragment.app.o
    public void onViewCreated(View view, Bundle bundle) {
        Dialog dialog;
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        hae haeVar = hae.b;
        x2i x2iVar = hae.c;
        haeVar.getClass();
        x2iVar.getClass();
        yyd yydVar = (yyd) haeVar.a;
        yydVar.getClass();
        ReentrantLock reentrantLock = yydVar.a;
        reentrantLock.lock();
        try {
            tyd tydVar = (tyd) yydVar.b.remove(x2iVar);
            if (tydVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = tydVar.b;
                ?? r10 = tydVar.a;
                long j2 = elapsedRealtime - j;
                tydVar.c = j2;
                if (j2 < 0) {
                    su4.s(2, null, r10.z() + " duration cannot be negative: " + tydVar.c, null);
                }
                y2x.t(0L, r10.G(), 50, r10.z()).c(tydVar.c, TimeUnit.MILLISECONDS);
            }
            Log.d("Pulse", "Overflow.Any.TotalDuration - finish");
            if (Build.VERSION.SDK_INT < 35 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
                return;
            }
            window.setNavigationBarContrastEnforced(true);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.fragment.app.i
    public final void show(y yVar, String str) {
        yVar.getClass();
        yVar.getClass();
        a aVar = new a(yVar);
        aVar.d(0, this, str, 1);
        aVar.k(true, true);
    }

    @Override // androidx.fragment.app.i
    public final void showNow(y yVar, String str) {
        a l = su4.l(yVar, yVar);
        l.d(0, this, str, 1);
        if (l.i) {
            xq0.q("This transaction is already being added to the back stack");
        } else {
            l.j = false;
            l.t.A(l, true);
        }
    }
}
