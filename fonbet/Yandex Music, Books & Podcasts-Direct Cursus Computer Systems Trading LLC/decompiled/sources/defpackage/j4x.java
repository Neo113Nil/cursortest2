package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import androidx.media3.session.MediaSessionService;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.skeleton.blocks.artistconcerts.ArtistConcertsBlockApi;
import com.yandex.music.shared.skeleton.blocks.artistconcerts.ArtistConcertsBlockResponseDto;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import org.xmlpull.v1.XmlPullParserException;
import retrofit2.Call;

/* loaded from: classes.dex */
public final /* synthetic */ class j4x implements z2o, ic, gvs, que, xjh, aoo, uno {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public j4x(Context context, XmlResourceParser xmlResourceParser) {
        this.a = 22;
        this.b = -1;
        this.c = new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), cen.u);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.b = obtainStyledAttributes.getResourceId(index, this.b);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            qer qerVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                qerVar = new qer(context, xmlResourceParser);
                                ((SparseArray) this.c).put(qerVar.a, qerVar);
                                break;
                            } else {
                                break;
                            }
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                rer rerVar = new rer(context, xmlResourceParser);
                                if (qerVar != null) {
                                    qerVar.b.add(rerVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    @Override // defpackage.xjh
    public boolean A() {
        return true;
    }

    @Override // defpackage.uno
    public long B() {
        u();
        return ((SparseIntArray) this.c).keyAt(this.b) + 1;
    }

    public synchronized void C(xwh xwhVar, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
            Object obj = linkedHashMap.get(xwhVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(xwhVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            bln blnVar = new bln(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList.add(blnVar);
                    break;
                }
                bln blnVar2 = (bln) arrayList.get(i2);
                if (i < blnVar2.d) {
                    i2++;
                } else if (blnVar2.a == identityHashCode && blnVar2.b.get() == bitmap) {
                    arrayList.set(i2, blnVar);
                } else {
                    arrayList.add(i2, blnVar);
                }
            }
            int i3 = this.b;
            this.b = i3 + 1;
            if (i3 >= 10) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void D() {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        if (u()) {
            return;
        }
        while (this.b < sparseIntArray.size() && sparseIntArray.valueAt(this.b) == 0) {
            this.b++;
        }
    }

    @Override // defpackage.gvs
    public void E(zvs zvsVar) {
        zvsVar.getClass();
        ((xol) this.c).e(new qim(zvsVar, 100));
    }

    public int F(int i) {
        float f = -1;
        SparseArray sparseArray = (SparseArray) this.c;
        int i2 = 0;
        if (-1 == i) {
            qer qerVar = i == -1 ? (qer) sparseArray.valueAt(0) : (qer) sparseArray.get(-1);
            if (qerVar != null) {
                ArrayList arrayList = qerVar.b;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((rer) arrayList.get(i2)).a(f, f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? qerVar.c : ((rer) arrayList.get(i2)).e;
                }
            }
        } else {
            qer qerVar2 = (qer) sparseArray.get(i);
            if (qerVar2 != null) {
                ArrayList arrayList2 = qerVar2.b;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((rer) arrayList2.get(i2)).a(f, f)) {
                        break;
                    }
                    i2++;
                }
                return i2 == -1 ? qerVar2.c : ((rer) arrayList2.get(i2)).e;
            }
        }
        return -1;
    }

    public void G(nkx nkxVar) {
        String str;
        r5x r5xVar = (r5x) this.c;
        int i = this.b;
        try {
            if (r5xVar.C == null) {
                throw null;
            }
            m2x m2xVar = r5xVar.C;
            String packageName = r5xVar.A.getPackageName();
            switch (i) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            u4x u4xVar = new u4x(nkxVar);
            e2x e2xVar = (e2x) m2xVar;
            Parcel Q0 = e2xVar.Q0();
            Q0.writeString(packageName);
            Q0.writeString(str);
            int i2 = z1x.a;
            Q0.writeStrongBinder(u4xVar);
            try {
                e2xVar.h.transact(1, Q0, null, 1);
                Q0.recycle();
            } catch (Throwable th) {
                Q0.recycle();
                throw th;
            }
        } catch (Exception e) {
            r5xVar.G(107, 28, b6x.u);
            l8x.h("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            nkxVar.d = true;
            omx omxVar = nkxVar.b;
            if (omxVar != null) {
                bmx bmxVar = omxVar.b;
                bmxVar.getClass();
                if (tjx.f.R(bmxVar, null, 0)) {
                    tjx.d(bmxVar);
                    nkxVar.a = null;
                    nkxVar.b = null;
                    nkxVar.c = null;
                }
            }
        }
    }

    @Override // defpackage.xjh
    public MediaCodecInfo a(int i) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i];
    }

    @Override // defpackage.aoo
    public void b() {
        pg5 pg5Var = ((wio) this.c).l;
        if (pg5Var != null) {
            throw pg5Var;
        }
    }

    public void c() {
        this.b = 0;
        Iterator it = ((LinkedHashMap) this.c).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                bln blnVar = (bln) CollectionsKt.firstOrNull(arrayList);
                if ((blnVar != null ? (Bitmap) blnVar.b.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((bln) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // defpackage.xjh
    public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // defpackage.que
    public void e(char c) {
        f(this.b, 1);
        char[] cArr = (char[]) this.c;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }

    public void f(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    @Override // defpackage.uno
    public boolean g() {
        u();
        return false;
    }

    @Override // defpackage.uno
    public int getCount() {
        u();
        return ((SparseIntArray) this.c).valueAt(this.b);
    }

    public Intent h(mzb mzbVar, int i) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(mzbVar.a.b);
        MediaSessionService mediaSessionService = (MediaSessionService) this.c;
        intent.setComponent(new ComponentName(mediaSessionService, mediaSessionService.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        return intent;
    }

    public boolean i() {
        return ((qra) this.c) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(uvn uvnVar, boolean z, String str, cg6 cg6Var) {
        u31 u31Var;
        int i;
        bii biiVar;
        if (cg6Var instanceof u31) {
            u31Var = (u31) cg6Var;
            int i2 = u31Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u31Var.l = i2 - Integer.MIN_VALUE;
                Object obj = u31Var.j;
                nm6 nm6Var = nm6.a;
                i = u31Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<ArtistConcertsBlockResponseDto>> a = ((ArtistConcertsBlockApi) ((jyr) this.c).getValue()).a(uvnVar.e().a, men.G(uvnVar.a()), z ? "no-cache" : null, str);
                    u31Var.l = 1;
                    obj = swf.N(a, u31Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    o31 a2 = ((ArtistConcertsBlockResponseDto) ((aii) biiVar).a).a(this.b);
                    return a2 == null ? new nj6(null) : new qj6(a2);
                }
                if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    return new kj6(i3, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
                }
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
        }
        u31Var = new u31(this, cg6Var);
        Object obj2 = u31Var.j;
        nm6 nm6Var2 = nm6.a;
        i = u31Var.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public void k(String str) {
        int i = this.b;
        if (i > 1) {
            g0c g0cVar = (g0c) this.c;
            String concat = (k5r.i(i, "Был сделан повторный запрос в мобильный апи: количество попыток - ") + ", результат - " + str).concat(", request = check_payment_v2");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r1f r1fVar = r1f.a;
            linkedHashMap.put(ServiceCommand.TYPE_REQ, new jkr("check_payment_v2"));
            linkedHashMap.put("attempts", new oqe((long) i, false));
            linkedHashMap.put(CameraService.RESULT, new jkr(str));
            vtm k = su4.k(concat, linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
            ci0 ci0Var = qjb.a;
            ci0Var.a = su4.g(1, ci0Var.a);
            k.u(qee.n() + ci0Var.a, "eventus_id");
            ((x60) g0cVar).a(su4.j(k, "event_name", "retry_mobile_request", "retry_mobile_request", k));
        }
    }

    @Override // defpackage.xjh
    public boolean l(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public long m(gm7 gm7Var) {
        d7k d7kVar = (d7k) this.c;
        int i = 0;
        gm7Var.l(d7kVar.a, 0, 1, false);
        int i2 = d7kVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        gm7Var.l(d7kVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (d7kVar.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    @Override // defpackage.gvs
    public void n(zvs zvsVar, float f) {
        zvsVar.getClass();
        if (((int) (f / 10)) * 10 > this.b) {
            ((xol) this.c).e(new sim(zvsVar, (int) f));
        }
        this.b = (int) f;
    }

    @Override // defpackage.uno
    public void next() {
        u();
        this.b++;
        D();
    }

    @Override // defpackage.xjh
    public int o() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    @Override // defpackage.aoo
    public boolean p() {
        wio wioVar = (wio) this.c;
        int i = this.b;
        if (wioVar.q) {
            return false;
        }
        vio vioVar = (vio) wioVar.e.get(i);
        return vioVar.c.t(vioVar.d);
    }

    @Override // defpackage.aoo
    public int q(qdc qdcVar, qg7 qg7Var, int i) {
        wio wioVar = (wio) this.c;
        int i2 = this.b;
        if (wioVar.q) {
            return -3;
        }
        vio vioVar = (vio) wioVar.e.get(i2);
        return vioVar.c.y(qdcVar, qg7Var, i, vioVar.d);
    }

    @Override // defpackage.ic
    public boolean r(View view) {
        ((BottomSheetBehavior) this.c).setState(this.b);
        return true;
    }

    @Override // defpackage.uno
    public int s() {
        return -1;
    }

    @Override // defpackage.uno
    public int t() {
        u();
        return ((SparseIntArray) this.c).keyAt(this.b);
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.uno
    public boolean u() {
        return this.b >= ((SparseIntArray) this.c).size();
    }

    @Override // defpackage.gvs
    public void v(zvs zvsVar) {
        zvsVar.getClass();
        ((xol) this.c).e(new rim(zvsVar, 0));
    }

    @Override // defpackage.z2o
    public k2o w(k2o k2oVar, pwj pwjVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) k2oVar.get()).compress((Bitmap.CompressFormat) this.c, this.b, byteArrayOutputStream);
        k2oVar.g();
        return new sn3(byteArrayOutputStream.toByteArray());
    }

    @Override // defpackage.que
    public void writeLong(long j) {
        z(String.valueOf(j));
    }

    @Override // defpackage.aoo
    public int x(long j) {
        wio wioVar = (wio) this.c;
        int i = this.b;
        if (wioVar.q) {
            return -3;
        }
        vio vioVar = (vio) wioVar.e.get(i);
        zno znoVar = vioVar.c;
        int r = znoVar.r(j, vioVar.d);
        znoVar.D(r);
        return r;
    }

    @Override // defpackage.que
    public void y(String str) {
        int i;
        str.getClass();
        f(this.b, str.length() + 2);
        char[] cArr = (char[]) this.c;
        int i2 = this.b;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = pkr.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    f(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = pkr.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) this.c)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = pkr.a[charAt];
                                str2.getClass();
                                f(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) this.c, i5);
                                int length3 = str2.length() + i5;
                                this.b = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) this.c;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                this.b = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) this.c)[i5] = charAt;
                    }
                    i5 = i;
                }
                f(i5, 1);
                ((char[]) this.c)[i5] = '\"';
                this.b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        this.b = i4 + 1;
    }

    @Override // defpackage.que
    public void z(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public /* synthetic */ j4x(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public j4x(int i, mi3[] mi3VarArr) {
        this.a = 18;
        mi3VarArr.getClass();
        this.b = i;
        this.c = mi3VarArr;
    }

    public j4x(xol xolVar) {
        this.a = 6;
        this.c = xolVar;
        this.b = -1;
    }

    public j4x(SparseIntArray sparseIntArray) {
        this.a = 19;
        sparseIntArray.getClass();
        this.c = sparseIntArray;
        D();
    }

    public j4x(int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = KotlinVersion.MAX_COMPONENT_VALUE;
                this.c = null;
                break;
            case 15:
                this.c = new LinkedHashMap();
                break;
            case 21:
                this.c = new d7k(8);
                break;
            default:
                this.c = Bitmap.CompressFormat.JPEG;
                this.b = 100;
                break;
        }
    }

    public j4x(upq upqVar, int i) {
        this.a = 1;
        e0j c = upqVar.c();
        c.getClass();
        this.b = i;
        this.c = btf.b(new w2(c, 8));
    }

    public j4x(g0c g0cVar) {
        this.a = 12;
        this.c = g0cVar;
    }

    public /* synthetic */ j4x(int i, boolean z) {
        this.a = i;
    }

    public j4x(MediaSessionService mediaSessionService) {
        this.a = 5;
        this.b = 0;
        this.c = mediaSessionService;
    }

    public j4x(int i, c9n[] c9nVarArr) {
        this.a = 24;
        this.b = i;
        this.c = c9nVarArr;
    }

    public j4x(int i, Notification notification) {
        this.a = 11;
        this.b = i;
        notification.getClass();
        this.c = notification;
    }

    public j4x(boolean z, boolean z2, boolean z3) {
        this.a = 10;
        this.b = (z || z2 || z3) ? 1 : 0;
    }
}
