package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class tg0 implements os, wr, t, bs, z8, b9, j00, xg, g40 {
    public static final k00 wxUZMvaN = new k00(19);
    public Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public tg0(int i, byte b) {
        this.NCTxEWno = i;
        switch (i) {
            case 8:
                this.MdtA4re8 = new AtomicReference(null);
                break;
            case 16:
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.MdtA4re8 = new N8VPGzVC(this);
                    break;
                } else {
                    this.MdtA4re8 = new HdOGZAzC(this);
                    break;
                }
        }
    }

    public nSmgoSB5 DK9slbsy(int i) {
        return null;
    }

    @Override // defpackage.os
    public boolean Ey6iv0m0(yr yrVar) {
        CTE3lpUp cTE3lpUp = (CTE3lpUp) this.MdtA4re8;
        if (yrVar == cTE3lpUp.wxUZMvaN) {
            return false;
        }
        cTE3lpUp.DK9slbsy = ((ka0) yrVar).lwWCatUu.qoPGr6Ce;
        os osVar = cTE3lpUp.P7K7Inc8;
        if (osVar != null) {
            return osVar.Ey6iv0m0(yrVar);
        }
        return false;
    }

    public boolean FySoLYna(int i, int i2) {
        c1 c1Var = (c1) this.MdtA4re8;
        Object obj = c1Var.NCTxEWno.get(i);
        Object obj2 = c1Var.MdtA4re8.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((ra) c1Var.VgvYg0wo.NCTxEWno.wxUZMvaN).wxUZMvaN(obj, obj2);
    }

    @Override // defpackage.z8
    public void I5GHvsYW(int i) {
        ((ContentInfo.Builder) this.MdtA4re8).setFlags(i);
    }

    @Override // defpackage.b9
    public ClipData MdtA4re8() {
        ClipData clip;
        clip = ((ContentInfo) this.MdtA4re8).getClip();
        return clip;
    }

    public void Mq3SeTnW(int i, int i2) {
        ((jp) this.MdtA4re8).qoPGr6Ce.MdtA4re8(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // defpackage.xg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object NCTxEWno(yg ygVar, g9 g9Var) {
        k3x7lurq k3x7lurqVar;
        int i;
        i40 i40Var;
        int i2 = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        u9 u9Var = u9.NCTxEWno;
        switch (i2) {
            case 26:
                if (g9Var instanceof k3x7lurq) {
                    k3x7lurqVar = (k3x7lurq) g9Var;
                    int i3 = k3x7lurqVar.Qr9iLBAD;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        k3x7lurqVar.Qr9iLBAD = i3 - Integer.MIN_VALUE;
                        Object obj = k3x7lurqVar.P7K7Inc8;
                        i = k3x7lurqVar.Qr9iLBAD;
                        if (i != 0) {
                            fn.SgZGMMPL(obj);
                            l9 l9Var = k3x7lurqVar.MdtA4re8;
                            l9Var.getClass();
                            i40 i40Var2 = new i40(ygVar, l9Var);
                            try {
                                k3x7lurqVar.VgvYg0wo = i40Var2;
                                k3x7lurqVar.Qr9iLBAD = 1;
                                try {
                                    Object Qr9iLBAD = ((dl) this.MdtA4re8).Qr9iLBAD(i40Var2, k3x7lurqVar);
                                    if (Qr9iLBAD != u9Var) {
                                        Qr9iLBAD = xe0Var;
                                    }
                                    if (Qr9iLBAD == u9Var) {
                                        return u9Var;
                                    }
                                    i40Var = i40Var2;
                                } catch (Throwable th) {
                                    th = th;
                                    i40Var = i40Var2;
                                    i40Var.amk52bBQ();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            if (i != 1) {
                                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i40Var = k3x7lurqVar.VgvYg0wo;
                            try {
                                fn.SgZGMMPL(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                i40Var.amk52bBQ();
                                throw th;
                            }
                        }
                        i40Var.amk52bBQ();
                        return xe0Var;
                    }
                }
                k3x7lurqVar = new k3x7lurq(this, g9Var);
                Object obj2 = k3x7lurqVar.P7K7Inc8;
                i = k3x7lurqVar.Qr9iLBAD;
                if (i != 0) {
                }
                i40Var.amk52bBQ();
                return xe0Var;
            default:
                Object NCTxEWno = ((bt) this.MdtA4re8).NCTxEWno(new at(ygVar, 6), g9Var);
                return NCTxEWno == u9Var ? NCTxEWno : xe0Var;
        }
    }

    @Override // defpackage.j00
    public void OnDfzHZD(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.MdtA4re8).setResultCode(i);
    }

    @Override // defpackage.b9
    public int OxcuoDLp() {
        int source;
        source = ((ContentInfo) this.MdtA4re8).getSource();
        return source;
    }

    @Override // defpackage.bs
    public void Qr9iLBAD(yr yrVar, MenuItem menuItem) {
        ((z3) this.MdtA4re8).b2ZJblxo.removeCallbacksAndMessages(yrVar);
    }

    public boolean RXQxj5Oe(int i, int i2) {
        c1 c1Var = (c1) this.MdtA4re8;
        Object obj = c1Var.NCTxEWno.get(i);
        Object obj2 = c1Var.MdtA4re8.get(i2);
        if (obj != null && obj2 != null) {
            return ((ra) c1Var.VgvYg0wo.NCTxEWno.wxUZMvaN).MdtA4re8(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public void SgZGMMPL(int i, int i2) {
        ((jp) this.MdtA4re8).qoPGr6Ce.wxUZMvaN(i, i2);
    }

    public void U0LaHZX7(int i, int i2) {
        c1 c1Var = (c1) this.MdtA4re8;
        Object obj = c1Var.NCTxEWno.get(i);
        Object obj2 = c1Var.MdtA4re8.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        ((ra) c1Var.VgvYg0wo.NCTxEWno.wxUZMvaN).getClass();
    }

    public nSmgoSB5 WYNAV5pd(int i) {
        return null;
    }

    @Override // defpackage.g40
    public boolean amk52bBQ() {
        return true;
    }

    @Override // defpackage.wr
    public boolean b2ZJblxo(yr yrVar, MenuItem menuItem) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        String valueOf;
        switch (this.NCTxEWno) {
            case 3:
                D4B4MtvK d4B4MtvK = ((ActionMenuView) this.MdtA4re8).lwWCatUu;
                if (d4B4MtvK == null) {
                    return false;
                }
                Iterator it = ((CopyOnWriteArrayList) ((vc0) d4B4MtvK).NCTxEWno.eIA6dogk.VgvYg0wo).iterator();
                while (it.hasNext()) {
                    if (((xi) it.next()).qoPGr6Ce.lDXGDhIF()) {
                        return true;
                    }
                }
                return false;
            default:
                rv rvVar = ((BottomNavigationView) this.MdtA4re8).P7K7Inc8;
                if (rvVar == null) {
                    return false;
                }
                uu uuVar = (uu) ((wm) rvVar).NCTxEWno;
                menuItem.getClass();
                uuVar.getClass();
                gu guVar = uuVar.NCTxEWno;
                pu P7K7Inc8 = guVar.P7K7Inc8();
                P7K7Inc8.getClass();
                ru ruVar = P7K7Inc8.wxUZMvaN;
                ruVar.getClass();
                if (ruVar.Qr9iLBAD(menuItem.getItemId()) instanceof QhQjwNAr) {
                    i = R.anim.nav_default_enter_anim;
                    i2 = R.anim.nav_default_exit_anim;
                    i3 = R.anim.nav_default_pop_enter_anim;
                    i4 = R.anim.nav_default_pop_exit_anim;
                } else {
                    i = R.animator.nav_default_enter_anim;
                    i2 = R.animator.nav_default_exit_anim;
                    i3 = R.animator.nav_default_pop_enter_anim;
                    i4 = R.animator.nav_default_pop_exit_anim;
                }
                int i6 = i;
                int i7 = i2;
                int i8 = i3;
                int i9 = i4;
                if ((menuItem.getOrder() & 196608) == 0) {
                    int i10 = ru.jb9XjC4I;
                    i5 = fn.jb9XjC4I(guVar.b2ZJblxo()).MdtA4re8.qoPGr6Ce;
                    z = true;
                } else {
                    i5 = -1;
                    z = false;
                }
                try {
                    uuVar.MdtA4re8(menuItem.getItemId(), null, new xu(true, true, i5, false, z, i6, i7, i8, i9));
                    pu P7K7Inc82 = guVar.P7K7Inc8();
                    if (P7K7Inc82 != null) {
                        if (ra.gjV1z5T1(menuItem.getItemId(), P7K7Inc82)) {
                            return false;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    int i11 = pu.b2ZJblxo;
                    Context context = uuVar.qoPGr6Ce;
                    int itemId = menuItem.getItemId();
                    if (itemId <= 16777215) {
                        valueOf = String.valueOf(itemId);
                    } else {
                        try {
                            valueOf = context.getResources().getResourceName(itemId);
                            valueOf.getClass();
                        } catch (Resources.NotFoundException unused) {
                            valueOf = String.valueOf(itemId);
                        }
                    }
                    StringBuilder b2ZJblxo = q70.b2ZJblxo("Ignoring onNavDestinationSelected for MenuItem ", valueOf, " as it cannot be found from the current destination ");
                    b2ZJblxo.append(guVar.P7K7Inc8());
                    Log.i("NavigationUI", b2ZJblxo.toString(), e);
                }
                return true;
        }
    }

    @Override // defpackage.z8
    public c9 build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.MdtA4re8).build();
        return new c9(new tg0(build));
    }

    @Override // defpackage.bs
    public void eVhOlqcC(yr yrVar, cs csVar) {
        z3 z3Var = (z3) this.MdtA4re8;
        Handler handler = z3Var.b2ZJblxo;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = z3Var.jb9XjC4I;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (yrVar == ((y3) arrayList.get(i)).NCTxEWno) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new x3(this, i2 < arrayList.size() ? (y3) arrayList.get(i2) : null, csVar, yrVar), yrVar, SystemClock.uptimeMillis() + 200);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void gjV1z5T1(q4 q4Var, h9 h9Var) {
        ow owVar;
        int i;
        if (h9Var instanceof ow) {
            owVar = (ow) h9Var;
            int i2 = owVar.b2ZJblxo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                owVar.b2ZJblxo = i2 - Integer.MIN_VALUE;
                Object obj = owVar.VgvYg0wo;
                i = owVar.b2ZJblxo;
                if (i == 0) {
                    if (i != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return;
                    } else {
                        fn.SgZGMMPL(obj);
                        throw new d7();
                    }
                }
                fn.SgZGMMPL(obj);
                x90 x90Var = (x90) this.MdtA4re8;
                owVar.b2ZJblxo = 1;
                x90Var.NCTxEWno(q4Var, owVar);
                return;
            }
        }
        owVar = new ow(this, h9Var);
        Object obj2 = owVar.VgvYg0wo;
        i = owVar.b2ZJblxo;
        if (i == 0) {
        }
    }

    public void i7xS8jrb() {
        ((ni) this.MdtA4re8).KlHjfFWx.hzgxAD8d();
    }

    @Override // defpackage.b9
    public int jb9XjC4I() {
        int flags;
        flags = ((ContentInfo) this.MdtA4re8).getFlags();
        return flags;
    }

    @Override // defpackage.j00
    public void k3x7lurq() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public ng0 lwWCatUu(p5 p5Var) {
        VZZbw3BB vZZbw3BB = (VZZbw3BB) this.MdtA4re8;
        String NCTxEWno = p5Var.NCTxEWno();
        if (NCTxEWno != null) {
            return vZZbw3BB.Qr9iLBAD(p5Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(NCTxEWno));
        }
        m1.sjUBp5pO("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.b9
    public ContentInfo ow5vqvCr() {
        return (ContentInfo) this.MdtA4re8;
    }

    @Override // defpackage.os
    public void qoPGr6Ce(yr yrVar, boolean z) {
        if (yrVar instanceof ka0) {
            ((ka0) yrVar).DK9slbsy.k3x7lurq().MdtA4re8(false);
        }
        os osVar = ((CTE3lpUp) this.MdtA4re8).P7K7Inc8;
        if (osVar != null) {
            osVar.qoPGr6Ce(yrVar, z);
        }
    }

    @Override // defpackage.z8
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.MdtA4re8).setExtras(bundle);
    }

    @Override // defpackage.z8
    public void sjUBp5pO(Uri uri) {
        ((ContentInfo.Builder) this.MdtA4re8).setLinkUri(uri);
    }

    public String toString() {
        switch (this.NCTxEWno) {
            case 12:
                return "ContentInfoCompat{" + ((ContentInfo) this.MdtA4re8) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.g40
    public f40 wxUZMvaN(String str) {
        str.getClass();
        ua0 ua0Var = (ua0) this.MdtA4re8;
        String databaseName = ua0Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                m1.NCTxEWno(q70.P7K7Inc8("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !ba0.Mq3SeTnW(databaseName).equals(ba0.Mq3SeTnW(str))) {
            m1.amk52bBQ("This driver is configured to open a database named '", ua0Var.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new ta0(ua0Var.KlHjfFWx());
    }

    @Override // defpackage.wr
    public void ygLcUYwZ(yr yrVar) {
        switch (this.NCTxEWno) {
            case 3:
                vc0 vc0Var = ((ActionMenuView) this.MdtA4re8).RXQxj5Oe;
                if (vc0Var != null) {
                    vc0Var.ygLcUYwZ(yrVar);
                    break;
                }
                break;
        }
    }

    public boolean ytu5o6f4(int i, int i2, Bundle bundle) {
        return false;
    }

    public tg0(ua0 ua0Var) {
        this.NCTxEWno = 29;
        ua0Var.getClass();
        this.MdtA4re8 = ua0Var;
    }

    public tg0(ug0 ug0Var, rg0 rg0Var, aa aaVar) {
        this.NCTxEWno = 0;
        ug0Var.getClass();
        rg0Var.getClass();
        aaVar.getClass();
        this.MdtA4re8 = new VZZbw3BB(ug0Var, rg0Var, aaVar);
    }

    public tg0(TextView textView) {
        this.NCTxEWno = 14;
        this.MdtA4re8 = new of(textView);
    }

    public tg0(EditText editText) {
        this.NCTxEWno = 13;
        this.MdtA4re8 = new mcXgUFR8(editText, 15);
    }

    public /* synthetic */ tg0(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    public tg0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.NCTxEWno = 18;
        if (Build.VERSION.SDK_INT >= 25) {
            this.MdtA4re8 = new zm(uri, clipDescription, uri2);
        } else {
            this.MdtA4re8 = new f0(uri, clipDescription, uri2, 7);
        }
    }

    public tg0(ContentInfo contentInfo) {
        this.NCTxEWno = 12;
        contentInfo.getClass();
        this.MdtA4re8 = y8.ow5vqvCr(contentInfo);
    }

    public tg0(int i) {
        this.NCTxEWno = 22;
        this.MdtA4re8 = ra.qoPGr6Ce(new int[i]);
    }

    public tg0(ClipData clipData, int i) {
        this.NCTxEWno = 11;
        this.MdtA4re8 = y8.eVhOlqcC(clipData, i);
    }

    public tg0(SideSheetBehavior sideSheetBehavior) {
        this.NCTxEWno = 28;
        this.MdtA4re8 = sideSheetBehavior;
        new d3vfVszL(10, this);
    }

    public tg0(BottomSheetBehavior bottomSheetBehavior) {
        this.NCTxEWno = 9;
        this.MdtA4re8 = bottomSheetBehavior;
        new i1(1, this);
    }

    private final void euDDoUNr(yr yrVar) {
    }

    @Override // defpackage.t
    public void P7K7Inc8(int i) {
    }

    @Override // defpackage.t
    public void lDXGDhIF(int i) {
    }

    @Override // defpackage.t
    public void KlHjfFWx(int i, float f) {
    }
}
