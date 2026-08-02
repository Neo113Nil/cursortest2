package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.music.shared.artist.screen.network.ArtistSkeletonApi;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.data.api.model.SkeletonDataDto;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.CardPlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final class rdk implements adu, kn5, nqo, wqo, hwq, u1o {
    public static final vpl h = new vpl();
    public static volatile rdk i;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public rdk(vm5 vm5Var, kn5 kn5Var) {
        this.a = 21;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<ox7> set = vm5Var.c;
        Set set2 = vm5Var.g;
        for (ox7 ox7Var : set) {
            int i2 = ox7Var.c;
            int i3 = ox7Var.b;
            boolean z = i2 == 0;
            m5n m5nVar = ox7Var.a;
            if (z) {
                if (i3 == 2) {
                    hashSet4.add(m5nVar);
                } else {
                    hashSet.add(m5nVar);
                }
            } else if (i2 == 2) {
                hashSet3.add(m5nVar);
            } else if (i3 == 2) {
                hashSet5.add(m5nVar);
            } else {
                hashSet2.add(m5nVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(m5n.a(t0n.class));
        }
        this.b = Collections.unmodifiableSet(hashSet);
        this.c = Collections.unmodifiableSet(hashSet2);
        this.d = Collections.unmodifiableSet(hashSet3);
        this.e = Collections.unmodifiableSet(hashSet4);
        this.f = Collections.unmodifiableSet(hashSet5);
        this.g = kn5Var;
    }

    public static void K(vhu vhuVar) {
        q8q sharedValues = ConstraintLayout.getSharedValues();
        int i2 = vhuVar.u;
        dml dmlVar = new dml();
        HashMap hashMap = sharedValues.a;
        HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(i2));
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(Integer.valueOf(i2), hashSet);
        }
        hashSet.add(new WeakReference(dmlVar));
    }

    public static tk7 e(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < readInt; i2++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                kac.f(k5r.i(readInt2, "Invalid value size: "));
                return null;
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = dvt.c;
            int i3 = 0;
            while (i3 != readInt2) {
                int i4 = i3 + min;
                bArr = Arrays.copyOf(bArr, i4);
                dataInputStream.readFully(bArr, i3, min);
                min = Math.min(readInt2 - i4, 10485760);
                i3 = i4;
            }
            hashMap.put(readUTF, bArr);
        }
        return new tk7(hashMap);
    }

    public static void g(tk7 tk7Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = tk7Var.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static final Object h(rdk rdkVar, ExoPlayer exoPlayer, aur aurVar) {
        zt3 zt3Var = new zt3(1, qxe.b(aurVar));
        zt3Var.s();
        lw1 lw1Var = new lw1(zt3Var, exoPlayer);
        exoPlayer.j0(lw1Var);
        zt3Var.u(new kw1(0, exoPlayer, lw1Var));
        Object q = zt3Var.q();
        return q == nm6.a ? q : Unit.a;
    }

    public static final void p(rdk rdkVar) {
        Object obj;
        Iterator it = ((CopyOnWriteArraySet) rdkVar.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Boolean) ((hgl) obj).b.a.getValue()).booleanValue()) {
                    break;
                }
            }
        }
        j1 j1Var = (j1) rdkVar.d;
        if (obj != null) {
            j1Var.b();
        } else {
            j1Var.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(rdk rdkVar, ow owVar, a6l a6lVar, cg6 cg6Var) {
        iw iwVar;
        int i2;
        List list;
        if (cg6Var instanceof iw) {
            iwVar = (iw) cg6Var;
            int i3 = iwVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iwVar.n = i3 - Integer.MIN_VALUE;
                Object obj = iwVar.l;
                Object obj2 = nm6.a;
                i2 = iwVar.n;
                if (i2 != 0) {
                    qgg.h0(obj);
                    lt ltVar = owVar.a;
                    iwVar.j = owVar;
                    iwVar.k = a6lVar;
                    iwVar.n = 1;
                    obj = rdkVar.y(ltVar, iwVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a6lVar = iwVar.k;
                    owVar = iwVar.j;
                    qgg.h0(obj);
                }
                a6l a6lVar2 = a6lVar;
                list = (List) obj;
                if (list != null) {
                    return Unit.a;
                }
                lt ltVar2 = owVar.a;
                e eVar = (e) ((jyr) rdkVar.c).getValue();
                CardPlaybackScope p = d.p((nrf) rdkVar.e);
                eVar.getClass();
                asq.t(z5l.e((z5l) ((jyr) rdkVar.d).getValue(), new jw(p.c(ltVar2), list, a6lVar2, null, 0)), (Context) rdkVar.b, new p1n(8));
                return Unit.a;
            }
        }
        iwVar = new iw(rdkVar, cg6Var);
        Object obj3 = iwVar.l;
        Object obj22 = nm6.a;
        i2 = iwVar.n;
        if (i2 != 0) {
        }
        a6l a6lVar22 = a6lVar;
        list = (List) obj3;
        if (list != null) {
        }
    }

    public d1 A(String str) {
        Object t7oVar;
        Object value;
        d1 d1Var;
        str.getClass();
        try {
            r7o r7oVar = z7o.b;
            q1 a = ((j1) this.d).a(str);
            String str2 = (String) this.b;
            str2.getClass();
            t7oVar = new d1(str2, a);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Object obj = d1.g;
        if (t7oVar instanceof t7o) {
            t7oVar = obj;
        }
        d1 d1Var2 = (d1) t7oVar;
        x97.y((tf6) this.c, null, null, new j9w(str, d1Var2, null, 1), 3);
        xdr xdrVar = (xdr) this.g;
        do {
            value = xdrVar.getValue();
            d1Var = (d1) value;
            if (!Intrinsics.d(d1Var, d1Var2)) {
                d1Var = d1Var2;
            }
        } while (!xdrVar.k(value, d1Var));
        return d1Var2;
    }

    @Override // defpackage.nqo
    public TextView B() {
        return (TextView) this.c;
    }

    public owj C(Class cls) {
        return r(m5n.a(cls));
    }

    public s3n D() {
        return (s3n) ((jyr) this.c).getValue();
    }

    public sq3 E(String str) {
        HashMap hashMap = (HashMap) this.b;
        sq3 sq3Var = (sq3) hashMap.get(str);
        if (sq3Var != null) {
            return sq3Var;
        }
        SparseArray sparseArray = (SparseArray) this.c;
        int size = sparseArray.size();
        int i2 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            keyAt = i2;
        }
        sq3 sq3Var2 = new sq3(keyAt, str, tk7.c);
        hashMap.put(str, sq3Var2);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.e).put(keyAt, true);
        ((tq3) this.f).b(sq3Var2);
        return sq3Var2;
    }

    @Override // defpackage.wqo
    public TextView F() {
        return (TextView) this.d;
    }

    public mgk H() {
        return (mgk) ((rzm) this.g).get();
    }

    public boolean I() {
        String string;
        Activity activity = (Activity) this.b;
        int applicationEnabledSetting = activity.getPackageManager().getApplicationEnabledSetting("com.android.providers.downloads");
        int i2 = 0;
        if (applicationEnabledSetting == 0 || applicationEnabledSetting == 1) {
            return false;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:com.android.providers.downloads"));
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            string = activity.getString(R.string.download_manager_disabled_can_show_app_info);
        } else {
            try {
                PackageManager packageManager = activity.getPackageManager();
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo("com.android.providers.downloads", 0));
                applicationLabel.getClass();
                string = activity.getString(R.string.download_manager_disabled_can_not_show_app_info, applicationLabel.toString());
            } catch (Exception unused) {
                string = activity.getString(R.string.download_manager_disabled_can_show_app_info);
            }
        }
        new AlertDialog.Builder(activity).setMessage(string).setPositiveButton(R.string.download_manager_disabled_show_settings_button, new oba(i2, this)).create().show();
        return true;
    }

    public void J(long j) {
        tq3 tq3Var;
        SparseArray sparseArray = (SparseArray) this.c;
        HashMap hashMap = (HashMap) this.b;
        tq3 tq3Var2 = (tq3) this.f;
        tq3Var2.f(j);
        tq3 tq3Var3 = (tq3) this.g;
        if (tq3Var3 != null) {
            tq3Var3.f(j);
        }
        if (tq3Var2.d() || (tq3Var = (tq3) this.g) == null || !tq3Var.d()) {
            tq3Var2.j(hashMap, sparseArray);
        } else {
            ((tq3) this.g).j(hashMap, sparseArray);
            tq3Var2.g(hashMap);
        }
        tq3 tq3Var4 = (tq3) this.g;
        if (tq3Var4 != null) {
            tq3Var4.delete();
            this.g = null;
        }
    }

    public void M(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.e;
        HashMap hashMap = (HashMap) this.b;
        sq3 sq3Var = (sq3) hashMap.get(str);
        if (sq3Var != null && sq3Var.c.isEmpty() && sq3Var.d.isEmpty()) {
            hashMap.remove(str);
            int i2 = sq3Var.a;
            boolean z = sparseBooleanArray.get(i2);
            ((tq3) this.f).h(sq3Var, z);
            SparseArray sparseArray = (SparseArray) this.c;
            if (z) {
                sparseArray.remove(i2);
                sparseBooleanArray.delete(i2);
            } else {
                sparseArray.put(i2, null);
                ((SparseBooleanArray) this.d).put(i2, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object N(boolean z, cg6 cg6Var) {
        vj1 vj1Var;
        int i2;
        dnk dnkVar;
        String str = (String) this.b;
        gj1 gj1Var = (gj1) this.d;
        if (cg6Var instanceof vj1) {
            vj1Var = (vj1) cg6Var;
            int i3 = vj1Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vj1Var.m = i3 - Integer.MIN_VALUE;
                Object obj = vj1Var.k;
                nm6 nm6Var = nm6.a;
                i2 = vj1Var.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    ab1 ab1Var = (ab1) this.e;
                    vj1Var.j = z;
                    vj1Var.m = 1;
                    obj = ab1Var.a(str, false, vj1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = vj1Var.j;
                    qgg.h0(obj);
                }
                dnkVar = (dnk) obj;
                if (dnkVar != null) {
                    return new nj6(null);
                }
                Integer num = new Integer(dnkVar.c.size());
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num == null) {
                    return new nj6(null);
                }
                int intValue = num.intValue();
                ArrayList<oq> arrayList = dnkVar.b;
                n8g b = t75.b();
                t11[] t11VarArr = t11.a;
                b.add(new ke1(new nrf("artist_downloaded_tracks_id", "ARTIST_DOWNLOADED_TRACKS"), new onq("", new Integer(intValue)), f73.c, gj1Var.c));
                if (!arrayList.isEmpty()) {
                    nrf nrfVar = new nrf("artist_downloaded_albums_id", "ARTIST_DOWNLOADED_ALBUMS");
                    String str2 = gj1Var.b;
                    o43 o43Var = new o43(hrg.q("yandexmusic://artist/", str, "/all/albums"), null);
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    for (oq oqVar : arrayList) {
                        lt B = lxe.B(oqVar);
                        List list = oqVar.n;
                        ArrayList arrayList3 = new ArrayList(v75.o(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(ghh.O((zp2) it.next()));
                        }
                        arrayList2.add(new o20(B, arrayList3, oqVar.B));
                    }
                    b.add(new tig(nrfVar, str2, o43Var, arrayList2));
                }
                if (z) {
                    t11[] t11VarArr2 = t11.a;
                    b.add(new vjg(new nrf("artist_connectivity_info_id", "ARTIST_CONNECTIVITY_INFO_OFFLINE"), null, null, null, null));
                }
                return new qj6(new snq("artists", null, t75.a(b)));
            }
        }
        vj1Var = new vj1(this, cg6Var);
        Object obj2 = vj1Var.k;
        nm6 nm6Var2 = nm6.a;
        i2 = vj1Var.m;
        if (i2 != 0) {
        }
        dnkVar = (dnk) obj2;
        if (dnkVar != null) {
        }
    }

    public void O(gc8 gc8Var) {
        List<pat> list;
        if (Intrinsics.d((gc8) this.f, gc8Var)) {
            return;
        }
        this.f = gc8Var;
        List list2 = (List) this.g;
        if (list2 == null || (list = (List) ((LinkedHashMap) this.e).get(list2)) == null) {
            return;
        }
        for (pat patVar : list) {
            patVar.n.add(gc8Var);
            patVar.b();
        }
    }

    public void P(String str) {
        str.getClass();
        synchronized (((ArrayList) this.c)) {
            ((ArrayList) this.c).add(str);
        }
        v();
    }

    public void Q(List list) {
        Object wyoVar;
        list.getClass();
        cno cnoVar = (cno) this.f;
        if (list.isEmpty()) {
            wyoVar = new wyo(Unit.a);
        } else {
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                ((zqn) it.next()).cancel();
            }
            wyoVar = new vyo(CollectionsKt.X(list, ", ", null, null, null, 62), new Exception("Error during resource loading"));
        }
        r7o r7oVar = z7o.b;
        cnoVar.resumeWith(wyoVar);
    }

    @Override // defpackage.nqo
    public TextView R() {
        return (TextView) this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object S(boolean z, cg6 cg6Var) {
        wj1 wj1Var;
        int i2;
        bii biiVar;
        if (cg6Var instanceof wj1) {
            wj1Var = (wj1) cg6Var;
            int i3 = wj1Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wj1Var.l = i3 - Integer.MIN_VALUE;
                Object obj = wj1Var.j;
                nm6 nm6Var = nm6.a;
                i2 = wj1Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<SkeletonDataDto>> a = ((ArtistSkeletonApi) ((jyr) this.c).getValue()).a("artists", (String) this.b, z ? "no-cache" : null);
                    wj1Var.l = 1;
                    obj = swf.N(a, wj1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    snq t1 = gut.t1((SkeletonDataDto) ((aii) biiVar).a, (gnq) this.g, true);
                    return t1 == null ? new nj6(null) : new qj6(t1);
                }
                if (!(biiVar instanceof xhi)) {
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i4 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i4, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        wj1Var = new wj1(this, cg6Var);
        Object obj2 = wj1Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = wj1Var.l;
        if (i2 != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public pv9 T() {
        int i2 = 14;
        try {
            wn wnVar = (wn) this.e;
            if (wnVar != null) {
                try {
                    ncf ncfVar = (ncf) cib.I((atn) this.c, wnVar).b;
                    f3d f3dVar = (f3d) ncfVar.f(5);
                    f3dVar.d();
                    f3d.e(f3dVar.b, ncfVar);
                    return new pv9(i2, (kcf) f3dVar);
                } catch (aye | GeneralSecurityException e) {
                    Log.w("ix6", "cannot decrypt keyset: ", e);
                }
            }
            ncf t = ncf.t(((atn) this.c).Q(), y0c.a());
            if (t.p() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            f3d f3dVar2 = (f3d) t.f(5);
            f3dVar2.d();
            f3d.e(f3dVar2.b, t);
            return new pv9(i2, (kcf) f3dVar2);
        } catch (FileNotFoundException e2) {
            Log.w("ix6", "keyset not found, will generate a new one", e2);
            if (((qec) this.f) == null) {
                b6e.m("cannot read or generate keyset");
                return null;
            }
            kcf s = ncf.s();
            pv9 pv9Var = new pv9(i2, s);
            qec qecVar = (qec) this.f;
            synchronized (pv9Var) {
                hbf hbfVar = (hbf) qecVar.b;
                synchronized (pv9Var) {
                    mcf z = pv9Var.z(hbfVar);
                    s.d();
                    ncf.n((ncf) s.b, z);
                    int q = zut.a((ncf) pv9Var.u().b).o().q();
                    synchronized (pv9Var) {
                        for (int i3 = 0; i3 < ((ncf) ((kcf) pv9Var.b).b).p(); i3++) {
                            try {
                                mcf o = ((ncf) ((kcf) pv9Var.b).b).o(i3);
                                if (o.r() == q) {
                                    if (!o.t().equals(fbf.ENABLED)) {
                                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + q);
                                    }
                                    kcf kcfVar = (kcf) pv9Var.b;
                                    kcfVar.d();
                                    ncf.m((ncf) kcfVar.b, q);
                                    if (((wn) this.e) != null) {
                                        cib u = pv9Var.u();
                                        apo apoVar = (apo) this.d;
                                        wn wnVar2 = (wn) this.e;
                                        ncf ncfVar2 = (ncf) u.b;
                                        byte[] a = wnVar2.a(ncfVar2.c(), new byte[0]);
                                        try {
                                            if (!ncf.t(wnVar2.b(a, new byte[0]), y0c.a()).equals(ncfVar2)) {
                                                throw new GeneralSecurityException("cannot encrypt keyset");
                                            }
                                            t6b p = u6b.p();
                                            jn3 n = mn3.n(a, 0, a.length);
                                            p.d();
                                            u6b.m((u6b) p.b, n);
                                            rcf a2 = zut.a(ncfVar2);
                                            p.d();
                                            u6b.n((u6b) p.b, a2);
                                            if (!((SharedPreferences.Editor) apoVar.b).putString((String) apoVar.c, leu.M(((u6b) p.b()).c())).commit()) {
                                                kac.f("Failed to write to SharedPreferences");
                                                return null;
                                            }
                                        } catch (aye unused) {
                                            b6e.m("invalid keyset, corrupted key material");
                                            return null;
                                        }
                                    } else {
                                        cib u2 = pv9Var.u();
                                        apo apoVar2 = (apo) this.d;
                                        if (!((SharedPreferences.Editor) apoVar2.b).putString((String) apoVar2.c, leu.M(((ncf) u2.b).c())).commit()) {
                                            kac.f("Failed to write to SharedPreferences");
                                            return null;
                                        }
                                    }
                                    return pv9Var;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        throw new GeneralSecurityException("key not found: " + q);
                    }
                }
            }
        }
    }

    public wn U() {
        zg0 zg0Var = new zg0();
        boolean c = zg0Var.c((String) this.b);
        if (!c) {
            try {
                zg0.a((String) this.b);
            } catch (GeneralSecurityException | ProviderException e) {
                Log.w("ix6", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }
        try {
            return zg0Var.b((String) this.b);
        } catch (GeneralSecurityException | ProviderException e2) {
            if (c) {
                throw new KeyStoreException(hrg.q("the master key ", (String) this.b, " exists but is unusable"), e2);
            }
            Log.w("ix6", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object V(wh1 wh1Var, boolean z, cg6 cg6Var) {
        xj1 xj1Var;
        int i2;
        rj6 rj6Var;
        String str = (String) this.b;
        if (cg6Var instanceof xj1) {
            xj1Var = (xj1) cg6Var;
            int i3 = xj1Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xj1Var.l = i3 - Integer.MIN_VALUE;
                Object obj = xj1Var.j;
                Object obj2 = nm6.a;
                i2 = xj1Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (!xv7.C(str)) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("invalid artistId=".concat(str));
                        Assertions.throwOrSkip("ArtistSkeletonRepository", new FailedAssertionException("Artist screen opened for illegal artist id=".concat(str), illegalArgumentException));
                        return new aqq(zpq.b, illegalArgumentException);
                    }
                    int ordinal = wh1Var.ordinal();
                    if (ordinal == 0) {
                        xj1Var.l = 1;
                        obj = S(z, xj1Var);
                    } else if (ordinal == 1) {
                        xj1Var.l = 2;
                        obj = N(true, xj1Var);
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        xj1Var.l = 3;
                        obj = N(false, xj1Var);
                    }
                    return obj2;
                }
                if (i2 == 1) {
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                } else if (i2 == 2) {
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                } else {
                    if (i2 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                }
                return u7g.Y(rj6Var);
            }
        }
        xj1Var = new xj1(this, cg6Var);
        Object obj3 = xj1Var.j;
        Object obj22 = nm6.a;
        i2 = xj1Var.l;
        if (i2 != 0) {
        }
        return u7g.Y(rj6Var);
    }

    public void W(Uri uri) {
        Activity activity = (Activity) this.b;
        qdc qdcVar = (qdc) this.e;
        DownloadManager downloadManager = (DownloadManager) ((jyr) this.c).getValue();
        if (downloadManager == null) {
            try {
                I();
            } catch (PackageManager.NameNotFoundException unused) {
                new AlertDialog.Builder(activity).setMessage(R.string.download_manager_not_present).setPositiveButton(R.string.download_manager_not_present_ok_button, (DialogInterface.OnClickListener) null).create().show();
            } catch (IllegalArgumentException unused2) {
                new AlertDialog.Builder(activity).setMessage(R.string.download_manager_not_present).setPositiveButton(R.string.download_manager_not_present_ok_button, (DialogInterface.OnClickListener) null).create().show();
            }
            qdcVar.sendEvent("wm_download_file_error", tah.b(new Pair(Constants.KEY_MESSAGE, "problem with download manager")));
            return;
        }
        if (uri.getScheme() != null) {
            String scheme = uri.getScheme();
            String[] strArr = ff7.i;
            for (int i2 = 0; i2 < 2; i2++) {
                if (Intrinsics.d(strArr[i2], scheme)) {
                    String c = ((xz1) this.f).c();
                    if (c == null) {
                        return;
                    }
                    OkHttpClient okHttpClient = (OkHttpClient) this.g;
                    b0o b0oVar = new b0o();
                    String uri2 = uri.toString();
                    uri2.getClass();
                    b0oVar.g(uri2);
                    b0oVar.a("Authorization", c);
                    b0oVar.e("HEAD", null);
                    d0o b = b0oVar.b();
                    okHttpClient.getClass();
                    new mkn(okHttpClient, b, false).z(new wo7(1, this, uri, downloadManager));
                    Toast.makeText(activity, R.string.download_descr, 0).show();
                    return;
                }
            }
        }
        qdcVar.sendEvent("wm_download_file_error", uah.e(new Pair(Constants.KEY_MESSAGE, "not supported scheme for downloading"), new Pair("url", uri.toString())));
    }

    public void X() {
        ((tq3) this.f).e((HashMap) this.b);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((SparseArray) this.c).remove(sparseBooleanArray.keyAt(i2));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.e).clear();
    }

    public void Y(Context context, String str) {
        if (context == null) {
            xq0.x("need an Android context");
        } else {
            this.c = new atn(context, str);
            this.d = new apo(context, str);
        }
    }

    @Override // defpackage.nqo
    public TextView Z() {
        return (TextView) this.d;
    }

    @Override // defpackage.hwq
    public void a(zsq zsqVar) {
        zsqVar.getClass();
        this.g = zsqVar;
    }

    @Override // defpackage.kn5
    public Object b(Class cls) {
        if (!((Set) this.b).contains(m5n.a(cls))) {
            e7o.h(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object b = ((kn5) this.g).b(cls);
        if (!cls.equals(t0n.class)) {
            return b;
        }
        return new f7o();
    }

    @Override // defpackage.hwq
    public pjc c() {
        return (dkn) this.e;
    }

    @Override // defpackage.hwq
    public void d() {
        xsq xsqVar = (xsq) this.f;
        if (xsqVar == null) {
            return;
        }
        String str = xsqVar.a;
        List list = xsqVar.b;
        zsq zsqVar = (zsq) this.g;
        if (zsqVar == null) {
            return;
        }
        ak2 ak2Var = xsqVar.c;
        ak2Var.getClass();
        boolean z = (ak2Var instanceof yj2) && ((yj2) ak2Var).e;
        boolean z2 = !((Boolean) ((fwq) this.b).a.getValue()).booleanValue();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        x0q x0qVar = (x0q) this.d;
        if (z) {
            x0qVar.a(new n5t(str, zsqVar));
        } else {
            x0qVar.a(new m5t(str, zsqVar, list, z2));
        }
    }

    @Override // defpackage.kn5
    public uzm f(m5n m5nVar) {
        if (((Set) this.f).contains(m5nVar)) {
            return ((kn5) this.g).f(m5nVar);
        }
        e7o.h(m5nVar, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    @Override // defpackage.adu
    public View getRoot() {
        switch (this.a) {
        }
        return (LinearLayout) ((rdk) this.b).b;
    }

    @Override // defpackage.hwq
    public void i() {
        zsq zsqVar;
        xsq xsqVar = (xsq) this.f;
        if (xsqVar == null || (zsqVar = (zsq) this.g) == null) {
            return;
        }
        ((x0q) this.d).a(new n5t(xsqVar.a, zsqVar));
    }

    @Override // defpackage.kn5
    public uzm j(m5n m5nVar) {
        if (((Set) this.c).contains(m5nVar)) {
            return ((kn5) this.g).j(m5nVar);
        }
        e7o.h(m5nVar, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // defpackage.kn5
    public Object k(m5n m5nVar) {
        if (((Set) this.b).contains(m5nVar)) {
            return ((kn5) this.g).k(m5nVar);
        }
        e7o.h(m5nVar, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // defpackage.kn5
    public Set l(m5n m5nVar) {
        if (((Set) this.e).contains(m5nVar)) {
            return ((kn5) this.g).l(m5nVar);
        }
        e7o.h(m5nVar, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // defpackage.hwq
    public void m(xsq xsqVar, zsq zsqVar) {
        x0q x0qVar = (x0q) this.d;
        xsqVar.getClass();
        zsqVar.getClass();
        this.f = xsqVar;
        List list = xsqVar.b;
        String str = xsqVar.a;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        ak2 ak2Var = xsqVar.c;
        ak2Var.getClass();
        boolean z = (ak2Var instanceof yj2) && ((yj2) ak2Var).e;
        boolean z2 = !((Boolean) ((fwq) this.b).a.getValue()).booleanValue();
        boolean z3 = ((v5t) ((fkn) this.c).a.getValue()).a;
        if (z3) {
            if (z) {
                x0qVar.a(new n5t(str, zsqVar));
                return;
            } else {
                x0qVar.a(new m5t(str, zsqVar, list, z2));
                return;
            }
        }
        if (z3 || z) {
            return;
        }
        x0qVar.a(new m5t(str, zsqVar, list, z2));
    }

    @Override // defpackage.nqo
    public TextView m0() {
        return (TextView) this.g;
    }

    @Override // defpackage.kn5
    public uzm n(Class cls) {
        return j(m5n.a(cls));
    }

    @Override // defpackage.wqo
    public TextView o() {
        return (TextView) this.f;
    }

    @Override // defpackage.wqo
    public TextView o0() {
        return (TextView) this.e;
    }

    @Override // defpackage.nqo
    public ImageView p0() {
        return (ImageView) this.e;
    }

    @Override // defpackage.kn5
    public owj r(m5n m5nVar) {
        if (((Set) this.d).contains(m5nVar)) {
            return ((kn5) this.g).r(m5nVar);
        }
        e7o.h(m5nVar, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    @Override // defpackage.wqo
    public ProgressBar r0() {
        return (ProgressBar) this.c;
    }

    @Override // defpackage.u1o
    public void reset() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public synchronized ix6 s() {
        ix6 ix6Var;
        try {
            if (((String) this.b) != null) {
                this.e = U();
            }
            this.g = T();
            ix6Var = new ix6(3);
            ix6Var.b = (pv9) this.g;
        } catch (Throwable th) {
            throw th;
        }
        return ix6Var;
    }

    public MediaDescriptionCompat t() {
        return new MediaDescriptionCompat((String) this.b, (CharSequence) this.c, (String) this.d, null, (Bitmap) this.e, (Uri) this.f, (Bundle) this.g, null);
    }

    public void u(gc8 gc8Var) {
        this.f = null;
        Iterator it = ((LinkedHashMap) this.e).entrySet().iterator();
        while (it.hasNext()) {
            for (pat patVar : (List) ((Map.Entry) it.next()).getValue()) {
                LinkedHashSet linkedHashSet = patVar.n;
                wct.m(linkedHashSet);
                linkedHashSet.remove(gc8Var);
                patVar.b();
            }
        }
    }

    public void v() {
        if (((AtomicInteger) this.b).decrementAndGet() == 0 && ((AtomicBoolean) this.d).get() && !((AtomicBoolean) this.e).getAndSet(true)) {
            Q((ArrayList) this.c);
        }
    }

    @Override // defpackage.wqo
    public TextView w() {
        return (TextView) this.g;
    }

    public void x(List list) {
        zzb zzbVar = (zzb) this.b;
        dfb dfbVar = (dfb) this.c;
        if (((List) this.g) == list) {
            return;
        }
        this.g = list;
        gc8 gc8Var = (gc8) this.f;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        Object obj = linkedHashMap.get(list);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(list, obj);
        }
        List list2 = (List) obj;
        if (gc8Var != null) {
            u(gc8Var);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ix9 ix9Var = (ix9) it.next();
            szb szbVar = ix9Var.b;
            pzb pzbVar = szbVar instanceof pzb ? (pzb) szbVar : null;
            if (pzbVar == null) {
                dfbVar.d(new IllegalStateException("Invalid condition: '" + szbVar + '\'', new RuntimeException("Condition is not mutable!")));
            } else {
                RuntimeException runtimeException = pzbVar.f(zzbVar).isEmpty() ? new RuntimeException("No variables defined!") : null;
                if (runtimeException != null) {
                    dfbVar.d(new IllegalStateException("Invalid condition: '" + szbVar + '\'', runtimeException));
                } else {
                    list2.add(new pat(pzbVar, ix9Var.a, ix9Var.c, zzbVar, dfbVar, (qg8) this.d));
                }
            }
        }
        if (gc8Var != null) {
            O(gc8Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable y(lt ltVar, cg6 cg6Var) {
        hw hwVar;
        int i2;
        rj6 rj6Var;
        if (cg6Var instanceof hw) {
            hwVar = (hw) cg6Var;
            int i3 = hwVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hwVar.m = i3 - Integer.MIN_VALUE;
                Object obj = hwVar.k;
                nm6 nm6Var = nm6.a;
                i2 = hwVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    yr yrVar = (yr) ((jyr) this.g).getValue();
                    String str = ltVar.a;
                    hwVar.j = ltVar;
                    hwVar.m = 1;
                    obj = yrVar.d(str, hwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ltVar = hwVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return ((oq) ((qj6) rj6Var).a).F;
                }
                if (rj6Var instanceof pj6) {
                    su4.s(2, null, f1d.g("Error getting full album for id ", ltVar.a), null);
                    return null;
                }
                b6e.s();
                return null;
            }
        }
        hwVar = new hw(this, cg6Var);
        Object obj2 = hwVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = hwVar.m;
        if (i2 != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    public sq3 z(String str) {
        return (sq3) ((HashMap) this.b).get(str);
    }

    public /* synthetic */ rdk(ViewGroup viewGroup, View view, View view2, View view3, ImageView imageView, View view4, TextView textView, int i2) {
        this.a = i2;
        this.b = view;
        this.c = view2;
        this.d = view3;
        this.e = imageView;
        this.f = view4;
        this.g = textView;
    }

    public /* synthetic */ rdk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public rdk(cno cnoVar, ArrayList arrayList) {
        this.a = 8;
        this.f = cnoVar;
        this.g = arrayList;
        this.b = new AtomicInteger(0);
        this.c = new ArrayList();
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
    }

    public rdk(o8q o8qVar, g3i g3iVar) {
        this.a = 26;
        this.b = o8qVar;
        this.c = g3iVar;
    }

    public rdk(String str) {
        this.a = 0;
        str.getClass();
        this.b = str;
        this.c = l18.b.b(hag.I(s3n.class), true);
        this.d = btf.b(new s9j(24));
    }

    public rdk(fwq fwqVar, fkn fknVar) {
        this.a = 25;
        this.b = fwqVar;
        this.c = fknVar;
        x0q b = y0q.b(0, 1, oi3.b, 1);
        this.d = b;
        this.e = new dkn(b);
    }

    public rdk(String str, xiq xiqVar, eno enoVar) {
        this.a = 1;
        tf6 e = gld.e(ca8.a);
        this.b = str;
        this.c = e;
        this.d = xiqVar;
        this.e = new CopyOnWriteArraySet();
        this.f = new CopyOnWriteArraySet();
        Continuation continuation = null;
        this.g = ydr.a(null);
        x97.y(e, null, null, new y6v(enoVar, this, continuation, 22), 3);
        x97.y(e, null, null, new r1w(this, continuation, 3), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rdk(mm6 mm6Var, mg5 mg5Var, kxi kxiVar, ekf ekfVar, Function2 function2, Function1 function1) {
        this.a = 12;
        mg5Var.getClass();
        kxiVar.getClass();
        this.b = mm6Var;
        this.c = mg5Var;
        this.d = kxiVar;
        this.e = ekfVar;
        this.f = function2;
        this.g = (ezc) function1;
    }

    public rdk(zzb zzbVar, dfb dfbVar, qg8 qg8Var) {
        this.a = 27;
        this.b = zzbVar;
        this.c = dfbVar;
        this.d = qg8Var;
        this.e = new LinkedHashMap();
    }

    public rdk(Context context, t tVar, bf bfVar, ahu ahuVar) {
        this.a = 22;
        this.b = context;
        this.d = tVar;
        this.e = bfVar;
        this.f = ahuVar;
        this.g = new bz9();
        this.c = btf.b(new kgk(14, this));
    }

    public rdk(xu6 xu6Var, efo efoVar, tcl tclVar, jf2 jf2Var) {
        this.a = 5;
        tf6 e = gld.e(mal.b());
        tclVar.getClass();
        this.b = xu6Var;
        this.c = efoVar;
        this.d = tclVar;
        this.e = e;
        this.f = jf2Var;
    }

    public rdk(rdk rdkVar) {
        this.a = 23;
        this.b = rdkVar;
        this.c = (TextView) rdkVar.f;
        this.d = (TextView) rdkVar.c;
        this.e = (ImageView) rdkVar.e;
        this.f = (TextView) rdkVar.g;
        this.g = (TextView) rdkVar.d;
    }

    public rdk(rdk rdkVar, byte b) {
        this.a = 24;
        this.b = rdkVar;
        this.c = (ProgressBar) rdkVar.g;
        this.d = (TextView) rdkVar.c;
        this.e = (TextView) rdkVar.f;
        this.f = (TextView) rdkVar.d;
        this.g = (TextView) rdkVar.e;
    }

    public rdk(Context context, nrf nrfVar, qyf qyfVar) {
        this.a = 2;
        context.getClass();
        qyfVar.getClass();
        this.b = context;
        this.e = nrfVar;
        this.f = qyfVar;
        bdt I = hag.I(e.class);
        l18 l18Var = l18.b;
        this.c = l18Var.b(I, true);
        this.d = l18Var.b(hag.I(z5l.class), true);
        this.g = l18Var.b(hag.I(yr.class), true);
    }

    public rdk(t tVar, x0 x0Var, qdc qdcVar, xz1 xz1Var, OkHttpClient okHttpClient) {
        this.a = 9;
        tVar.getClass();
        qdcVar.getClass();
        xz1Var.getClass();
        okHttpClient.getClass();
        this.b = tVar;
        this.d = x0Var;
        this.e = qdcVar;
        this.f = xz1Var;
        this.g = okHttpClient;
        this.c = btf.b(new yg6(18, this));
    }

    public rdk(String str, gj1 gj1Var, ab1 ab1Var, upq upqVar, gnq gnqVar) {
        this.a = 4;
        str.getClass();
        this.b = str;
        this.d = gj1Var;
        this.e = ab1Var;
        this.f = upqVar;
        this.g = gnqVar;
        this.c = btf.b(new ri1(2, this));
    }

    public /* synthetic */ rdk(int i2) {
        this.a = i2;
    }

    public rdk(Activity activity, y yVar, kxi kxiVar) {
        this.a = 10;
        activity.getClass();
        yVar.getClass();
        kxiVar.getClass();
        this.b = activity;
        this.d = yVar;
        this.e = kxiVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(z5l.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.f = (z5l) qdcVar.C(I);
        bdt I2 = hag.I(e.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.g = (e) qdcVar2.C(I2);
        this.c = btf.b(new htb(4));
    }

    public rdk(hgp hgpVar) {
        this.a = 20;
        this.b = (tf6) hgpVar.i;
        this.c = (kll) ((jyr) hgpVar.b).getValue();
        this.d = new qec(24, hgpVar);
        this.e = new tjl();
        this.f = new ujl();
        this.g = (oq7) ((jyr) hgpVar.h).getValue();
    }

    public rdk(rei reiVar) {
        this.a = 28;
        this.d = new ArrayList();
        this.b = "ViewTransitionController";
        this.g = new ArrayList();
        this.c = reiVar;
    }

    public rdk() {
        this.a = 3;
        this.c = null;
        this.d = null;
        this.b = null;
        this.e = null;
        this.f = null;
    }

    public rdk(kc7 kc7Var, File file, boolean z) {
        this.a = 6;
        this.b = new HashMap();
        this.c = new SparseArray();
        this.d = new SparseBooleanArray();
        this.e = new SparseBooleanArray();
        kkp kkpVar = kc7Var != null ? new kkp(kc7Var) : null;
        File file2 = new File(file, "cached_content_index.exi");
        yk3 yk3Var = new yk3();
        yk3Var.b = null;
        yk3Var.c = null;
        nnk nnkVar = new nnk();
        nnkVar.a = file2;
        nnkVar.b = new File(file2.getPath() + ".bak");
        yk3Var.d = nnkVar;
        if (kkpVar != null && !z) {
            this.f = kkpVar;
            this.g = yk3Var;
        } else {
            int i2 = dvt.a;
            this.f = yk3Var;
            this.g = kkpVar;
        }
    }

    public rdk(m8s m8sVar) {
        this.a = 11;
        m8sVar.getClass();
        this.c = m8sVar;
        this.g = i5e.a;
    }
}
