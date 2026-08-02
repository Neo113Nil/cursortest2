package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.provider.MediaStore;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey$KeyScheme;
import androidx.viewpager.widget.ViewPager;
import coil.compose.d;
import com.google.android.gms.common.internal.zam;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.ScheduledOrderDescriptionItem;
import com.yandex.mobile.ads.common.analytics.AdAnalyticsReporterAdapter;
import com.yandex.payment.sdk.ui.bind.AdditionalVerifyCardActivity;
import com.yandex.payment.sdk.ui.view.Default3DSWebView;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.model.address.PointType;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes11.dex */
public class ryh implements ra30, q0z0, wc, ve4, wm10, b88, s2h, ri2, k120, AdAnalyticsReporterAdapter, jax0, nr4, dt31, q25 {
    public static final ryh c = new ryh(1);
    public static final String[] w = {"_data"};
    public static final ryh x = new ryh(4);
    public final /* synthetic */ int a;
    public Object b;

    public ryh(Context context, qz4 qz4Var) {
        this.a = 2;
        this.b = qz4Var;
        try {
            nfh nfhVar = new nfh(context);
            nfhVar.C(MasterKey$KeyScheme.AES256_GCM);
            EncryptedSharedPreferences.create(context, "fintechsdk.auth", nfhVar.i(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        } catch (Exception unused) {
            ((qz4) this.b).getClass();
            try {
                context.deleteSharedPreferences("fintechsdk.auth");
                nfh nfhVar2 = new nfh(context);
                nfhVar2.C(MasterKey$KeyScheme.AES256_GCM);
                EncryptedSharedPreferences.create(context, "fintechsdk.auth", nfhVar2.i(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                ((qz4) this.b).getClass();
            } catch (Exception unused2) {
                ((qz4) this.b).getClass();
            }
        }
    }

    public static View P(Context context, int i, int i2) {
        ryh ryhVar = x;
        try {
            zax zaxVar = new zax(1, i, i2, null);
            return (View) ObjectWrapper.unwrap(((zam) ryhVar.z(context)).zae(ObjectWrapper.wrap(context), zaxVar));
        } catch (Exception e) {
            throw new RemoteCreator$RemoteCreatorException(oyr.h(i, i2, "Could not get button with size ", " and color "), e);
        }
    }

    public static qv0 q(yzj0 yzj0Var, j6s j6sVar) {
        e0l0 e0l0Var;
        d51 d51Var = yzj0Var.b;
        if (d51Var instanceof b51) {
            e0l0Var = j6sVar.d;
        } else {
            if (!(d51Var instanceof c51)) {
                w511.b();
                return null;
            }
            e0l0Var = j6sVar.c;
        }
        return (qv0) a.S(yzj0Var.a, e0l0Var.a);
    }

    public static int v(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int w(int i, boolean z) {
        return v(i) + (z ? 1 : 0) + i;
    }

    public static int x(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static zam y(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof zam ? (zam) queryLocalInterface : new zam(iBinder);
    }

    public boolean A() {
        com.yandex.div.core.view2.a aVar = (com.yandex.div.core.view2.a) this.b;
        if (!aVar.z) {
            return false;
        }
        BackHandlingRecyclerView backHandlingRecyclerView = aVar.c;
        backHandlingRecyclerView.performAccessibilityAction(64, null);
        backHandlingRecyclerView.sendAccessibilityEvent(1);
        aVar.b();
        return true;
    }

    public void B(Integer num, PointType pointType, String str, String str2, tls tlsVar, sls slsVar, Map map, PlainAddress plainAddress, d51 d51Var, boolean z, boolean z2) {
        com.yandex.go.logistics.cargo_flow.a aVar = (com.yandex.go.logistics.cargo_flow.a) this.b;
        hi50 hi50Var = new hi50(str, d51Var, str2, ((xnt) aVar.a0).e(map, cm2.a), plainAddress, z, z2, tlsVar);
        bmh bmhVar = new bmh(8, ((k) aVar.c0).m(), aVar);
        boolean z3 = false;
        if (pointType == null ? num != null && num.intValue() == 0 : pointType == PointType.SOURCE) {
            z3 = true;
        }
        aVar.E((m950) aVar.T.get(), new xh50(z3, hi50Var, num, new dke(22, bmhVar, slsVar), new bhh(7, bmhVar)), sy60.Q2, hxx.a);
    }

    public ArrayList C(List list, Calendar calendar, int i, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((x3w) obj).getF() == null || !z) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            x3w x3wVar = (x3w) it.next();
            if (x3wVar instanceof o73) {
                o73 o73Var = (o73) x3wVar;
                String D = D(o73Var.d, calendar, i, o73Var.e);
                if (D.length() <= 0) {
                    D = null;
                }
                z2 = true;
                x3wVar = new o73(D == null ? str : D, o73Var.b, o73Var.c, o73Var.d, o73Var.e, o73Var.f, o73Var.g);
            } else if (x3wVar instanceof ScheduledOrderDescriptionItem) {
                ScheduledOrderDescriptionItem scheduledOrderDescriptionItem = (ScheduledOrderDescriptionItem) x3wVar;
                if (scheduledOrderDescriptionItem.d) {
                    int i2 = scheduledOrderDescriptionItem.g;
                    o73 o73Var2 = new o73(D(scheduledOrderDescriptionItem.a, calendar, i, i2), scheduledOrderDescriptionItem.b, scheduledOrderDescriptionItem.c, scheduledOrderDescriptionItem.a, i2, scheduledOrderDescriptionItem.e, scheduledOrderDescriptionItem.f);
                    z2 = true;
                    x3wVar = o73Var2;
                }
            }
            arrayList2.add(x3wVar);
        }
        if (z2) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.add(0, new o73(str, null, "", "", 0, null, null));
        return arrayList3;
    }

    public String D(String str, Calendar calendar, int i, int i2) {
        String p;
        if (i2 != 0) {
            wf7 wf7Var = wf7.a;
            Calendar c2 = calendar == null ? null : wf7.c(calendar, calendar.getTimeZone());
            if (c2 != null) {
                c2.add(12, i2);
                calendar = c2;
            }
        }
        iom0 iom0Var = (iom0) this.b;
        TimeZone timeZone = calendar.getTimeZone();
        iom0Var.c.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMMM", j5z.e());
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        String v = cvu0.v(str, "$DUE_DAY$", simpleDateFormat.format(calendar.getTime()), false);
        if (i == 0) {
            p = String.format("%1$tH:%1$tM", Arrays.copyOf(new Object[]{calendar}, 1));
        } else {
            wf7 wf7Var2 = wf7.a;
            Calendar c3 = wf7.c(calendar, calendar.getTimeZone());
            c3.add(12, i);
            p = g8e.p(String.format("%1$tH:%1$tM", Arrays.copyOf(new Object[]{calendar}, 1)), "-", String.format("%1$tH:%1$tM", Arrays.copyOf(new Object[]{c3}, 1)));
        }
        return cvu0.v(v, "$DUE_TIME$", p, false);
    }

    public void E(int i) {
        ((OutputStream) this.b).write(i);
    }

    public void F(byte[] bArr, int i, int i2) {
        ((OutputStream) this.b).write(bArr, i, i2);
    }

    public void G(int i) {
        if (i < 128) {
            E(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                F(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void H(a2[] a2VarArr) {
        for (a2 a2Var : a2VarArr) {
            a2Var.toASN1Primitive().n(this, true);
        }
    }

    public void I(int i, byte[] bArr, boolean z) {
        M(i, z);
        G(bArr.length);
        F(bArr, 0, bArr.length);
    }

    public void J(byte[] bArr, int i, int i2, int i3, boolean z) {
        M(i, z);
        G(i3);
        F(bArr, i2, i3);
    }

    public void K(boolean z, int i, a2[] a2VarArr) {
        M(i, z);
        E(128);
        H(a2VarArr);
        E(0);
        E(0);
    }

    public void L(int i, int i2) {
        if (i2 < 31) {
            E(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & HProv.PP_VERSION_TIMESTAMP);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & HProv.PP_VERSION_TIMESTAMP) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        F(bArr, i4, 6 - i4);
    }

    public void M(int i, boolean z) {
        if (z) {
            E(i);
        }
    }

    public void N(b3 b3Var) {
        b3Var.n(this, true);
    }

    public void O(b3[] b3VarArr) {
        for (b3 b3Var : b3VarArr) {
            b3Var.n(this, true);
        }
    }

    @Override // defpackage.q25
    public void a(r25 r25Var) {
    }

    @Override // defpackage.jax0
    public void b(Drawable drawable) {
    }

    @Override // defpackage.dt31
    public void c(float f, View view) {
        x5x0 x5x0Var = (x5x0) this.b;
        if (!x5x0Var.n && f > -1.0f && f < 1.0f) {
            ((h05) x5x0Var.f.get(view)).a();
        }
    }

    @Override // defpackage.b88
    public void d(Context context, qq31 qq31Var) {
        qq31Var.invoke(new Default3DSWebView(context, ((pwf) ((AdditionalVerifyCardActivity) this.b).getBaseComponent$paymentsdk_release()).c()));
    }

    public ga0 e() {
        s760 s760Var = (s760) this.b;
        if (!s760Var.c()) {
            return null;
        }
        String d = s760Var.d();
        String a = s760Var.a();
        if (a.length() == 0) {
            a = d.replace('\n', HexString.CHAR_SPACE);
        }
        return new ga0(d, a, false);
    }

    @Override // defpackage.jax0
    public void f(Drawable drawable) {
        d dVar = (d) this.b;
        dVar.l(new fa3(drawable != null ? dVar.k(drawable) : null));
    }

    @Override // defpackage.jax0
    public void g(Drawable drawable) {
    }

    @Override // defpackage.s2h
    public void h(String str) {
        switch (this.a) {
            case 14:
                ((w71) this.b).r(new h0(str, 6));
                break;
            default:
                ((n3h) ((as4) this.b).d.b).a(Uri.parse(str), DeeplinkSource.UNSPECIFIED);
                break;
        }
    }

    @Override // defpackage.q0z0
    public Cursor i(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.b).query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, w, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.k120
    public Object j() {
        String str;
        b5o a = ((b220) this.b).a();
        return (a == null || (str = a.a) == null) ? "api.messenger.yandex.net" : str;
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object k() {
        return "api.messenger.yandex.net";
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object l() {
        return "api.messenger.test.yandex.net";
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object m() {
        return "api.messenger.alpha.yandex.net";
    }

    @Override // defpackage.k120
    public Object o() {
        String str;
        b5o a = ((b220) this.b).a();
        return (a == null || (str = a.b) == null) ? "api.messenger.test.yandex.net" : str;
    }

    @Override // defpackage.wm10
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder instanceof SubMenuBuilder) {
            menuBuilder.getRootMenu().close(false);
        }
        wm10 wm10Var = ((androidx.appcompat.widget.d) this.b).x;
        if (wm10Var != null) {
            wm10Var.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // defpackage.wm10
    public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        androidx.appcompat.widget.d dVar = (androidx.appcompat.widget.d) this.b;
        if (menuBuilder == dVar.c) {
            return false;
        }
        dVar.R = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
        wm10 wm10Var = dVar.x;
        if (wm10Var != null) {
            return wm10Var.onOpenSubMenu(menuBuilder);
        }
        return false;
    }

    @Override // defpackage.q25
    public void p(r25 r25Var) {
        ((ViewPager) this.b).setCurrentItem(r25Var.b);
    }

    @Override // defpackage.ri2
    public jb7 provide() {
        return new jb7(3, new njd(j73.d0(new njd[0])), new zgl(9), (seu) this.b);
    }

    public View r() {
        View view = (View) ((WeakReference) this.b).get();
        if (view != null) {
            return view;
        }
        ny61.g("Animatable view deallocated before animation played");
        return null;
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object s() {
        return "api.messenger.alpha.yandex.net";
    }

    public fqf t() {
        return new fqf(5, (OutputStream) this.b);
    }

    public vvf u() {
        return new vvf(5, (OutputStream) this.b);
    }

    public Object z(Context context) {
        Context context2;
        if (((zam) this.b) == null) {
            cvw.l(context);
            AtomicBoolean atomicBoolean = fwt.a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                throw new RemoteCreator$RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.b = y((IBinder) context2.getClassLoader().loadClass("com.google.android.gms.common.ui.SignInButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e) {
                throw new RemoteCreator$RemoteCreatorException("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new RemoteCreator$RemoteCreatorException("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new RemoteCreator$RemoteCreatorException("Could not instantiate creator.", e3);
            }
        }
        return (zam) this.b;
    }

    public /* synthetic */ ryh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ryh(View view) {
        this.a = 17;
        this.b = new WeakReference(view);
    }

    public /* synthetic */ ryh(int i) {
        this.a = i;
    }

    public ryh() {
        this.a = 23;
        this.b = new AudioAttributes.Builder();
    }
}
