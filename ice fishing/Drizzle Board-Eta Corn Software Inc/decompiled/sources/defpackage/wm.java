package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kolosta.rejin.jilosa.presentation.ui.MainActivity;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class wm implements rw, rv, aw, n3 {
    public final /* synthetic */ Object NCTxEWno;

    public /* synthetic */ wm(Object obj) {
        this.NCTxEWno = obj;
    }

    @Override // defpackage.rw
    public wi0 MdtA4re8(View view, wi0 wi0Var) {
        MainActivity mainActivity = (MainActivity) this.NCTxEWno;
        int i = MainActivity.eIA6dogk;
        view.getClass();
        bn Qr9iLBAD = wi0Var.qoPGr6Ce.Qr9iLBAD(519);
        Qr9iLBAD.getClass();
        mainActivity.SgZGMMPL = Qr9iLBAD.wxUZMvaN;
        view.setPadding(Qr9iLBAD.qoPGr6Ce, Qr9iLBAD.NCTxEWno, Qr9iLBAD.MdtA4re8, 0);
        VZZbw3BB vZZbw3BB = mainActivity.Mq3SeTnW;
        if (vZZbw3BB != null) {
            mainActivity.Ey6iv0m0(((BottomNavigationView) vZZbw3BB.qoPGr6Ce).getVisibility() == 0);
            return wi0Var;
        }
        fn.ytu5o6f4("binding");
        throw null;
    }

    @Override // defpackage.n3
    public void onCancel() {
        ((d80) this.NCTxEWno).qoPGr6Ce();
    }

    public boolean qoPGr6Ce(tg0 tg0Var, int i, Bundle bundle) {
        z8 z8Var;
        qIGtQL9b qigtql9b = (qIGtQL9b) this.NCTxEWno;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((an) tg0Var.MdtA4re8).P7K7Inc8();
                Parcelable parcelable = (Parcelable) ((an) tg0Var.MdtA4re8).MdtA4re8();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        an anVar = (an) tg0Var.MdtA4re8;
        ClipData clipData = new ClipData(anVar.qoPGr6Ce(), new ClipData.Item(anVar.wxUZMvaN()));
        if (i2 >= 31) {
            z8Var = new tg0(clipData, 2);
        } else {
            a9 a9Var = new a9();
            a9Var.MdtA4re8 = clipData;
            a9Var.wxUZMvaN = 2;
            z8Var = a9Var;
        }
        z8Var.sjUBp5pO(anVar.b2ZJblxo());
        z8Var.setExtras(bundle);
        return hg0.Qr9iLBAD(qigtql9b, z8Var.build()) == null;
    }
}
