package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.pulse.ApplicationParams;
import com.yandex.pulse.ComponentParams;
import com.yandex.pulse.R;
import com.yandex.pulse.metrics.LibraryProtos$LibraryProfileProto;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.yandex.pulse.metrics.a;
import com.yandex.pulse.metrics.d;
import com.yandex.pulse.metrics.e;
import com.yandex.pulse.metrics.f1;
import com.yandex.pulse.metrics.g;
import com.yandex.pulse.metrics.g1;
import com.yandex.pulse.metrics.h2;
import com.yandex.pulse.metrics.r;
import com.yandex.pulse.metrics.s2;
import defpackage.blu;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes8.dex */
public final class vc20 {
    public final int a;
    public final ud20 b;
    public final hd20[] c;
    public final lsb d;
    public final yku e;
    public final HashMap f;

    /* JADX WARN: Multi-variable type inference failed */
    public vc20(Context context, String str, int i, int i2, ud20 ud20Var, hd20[] hd20VarArr) {
        this.a = i2;
        this.b = ud20Var;
        this.c = hd20VarArr;
        lsb newBuilder = msb.newBuilder();
        this.d = newBuilder;
        SystemClock.elapsedRealtime();
        this.e = new yku();
        this.f = new HashMap();
        try {
            newBuilder.g(ByteBuffer.wrap(MessageDigest.getInstance("MD5").digest(str.getBytes(uza.a))).order(ByteOrder.BIG_ENDIAN).getLong());
            newBuilder.i(i);
            r newBuilder2 = SystemProfileProtos$SystemProfileProto.newBuilder();
            g gVar = g.a;
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String country = locale.getCountry();
            newBuilder2.f(country.length() != 0 ? oyr.f(LicenseUtility.SEPARATOR, language, country) : language);
            int i3 = 4;
            int i4 = 3;
            if (ud20Var != 0) {
                ComponentParams componentParams = (ComponentParams) ((fd20) ud20Var).b;
                newBuilder2.d(componentParams.packageName);
                newBuilder2.e(componentParams.versionString);
                int i5 = componentParams.channel;
                newBuilder2.g(SystemProfileProtos$SystemProfileProto.Channel.a((i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_UNKNOWN : SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_STABLE : SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_BETA : SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_DEV : SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_CANARY : SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_UNKNOWN).getNumber()));
            }
            f1 newBuilder3 = SystemProfileProtos$SystemProfileProto.Hardware.newBuilder();
            g1 newBuilder4 = SystemProfileProtos$SystemProfileProto.Hardware.a.newBuilder();
            newBuilder4.e();
            newBuilder4.d();
            newBuilder4.c(t1x0.a);
            newBuilder3.c((SystemProfileProtos$SystemProfileProto.Hardware.a) newBuilder4.build());
            newBuilder3.d(s1x0.a);
            newBuilder3.i((q1x0.a / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            String str2 = Build.MODEL;
            newBuilder3.e();
            newBuilder3.h(g.a(context).widthPixels);
            newBuilder3.f(g.a(context).heightPixels);
            newBuilder3.g(g.a(context).density);
            newBuilder2.h((SystemProfileProtos$SystemProfileProto.Hardware) newBuilder3.build());
            h2 newBuilder5 = SystemProfileProtos$SystemProfileProto.OS.newBuilder();
            newBuilder5.d();
            String str3 = Build.VERSION.RELEASE;
            newBuilder5.e();
            newBuilder5.c(r1x0.a);
            newBuilder2.j((SystemProfileProtos$SystemProfileProto.OS) newBuilder5.build());
            s2 newBuilder6 = SystemProfileProtos$SystemProfileProto.Yandex.newBuilder();
            if (ud20Var != 0) {
                newBuilder6.e(((ComponentParams) ((fd20) ud20Var).b).metricaApiKey);
                ApplicationParams applicationParams = (ApplicationParams) ((ComponentParams) ((id20) ud20Var).b);
                String str4 = applicationParams.metricaDeviceId;
                if (str4 != null) {
                    newBuilder6.f(str4);
                }
                String str5 = applicationParams.metricaUuid;
                if (str5 != null) {
                    newBuilder6.g(str5);
                }
            }
            newBuilder6.d(context.getResources().getInteger(R.integer.me_min_screen_width_bucket) >= 2 ? SystemProfileProtos$SystemProfileProto.Yandex.DeviceFormFactor.DEVICE_FORM_FACTOR_TABLET : SystemProfileProtos$SystemProfileProto.Yandex.DeviceFormFactor.DEVICE_FORM_FACTOR_PHONE);
            newBuilder6.c();
            newBuilder2.l((SystemProfileProtos$SystemProfileProto.Yandex) newBuilder6.build());
            newBuilder.j((SystemProfileProtos$SystemProfileProto) newBuilder2.build());
            ArrayList arrayList = new ArrayList(hd20VarArr.length);
            int length = hd20VarArr.length;
            int i6 = 0;
            while (i6 < length) {
                hd20 hd20Var = hd20VarArr[i6];
                a newBuilder7 = LibraryProtos$LibraryProfileProto.newBuilder();
                ComponentParams componentParams2 = (ComponentParams) hd20Var.b;
                newBuilder7.d(componentParams2.packageName);
                newBuilder7.e(componentParams2.versionString);
                int i7 = componentParams2.channel;
                newBuilder7.f(LibraryProtos$LibraryProfileProto.Channel.a((i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != i4 ? i7 != i3 ? SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_UNKNOWN : SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_STABLE : SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_BETA : SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_DEV : SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_CANARY : SystemProfileProtos$SystemProfileProto.Channel.CHANNEL_UNKNOWN).getNumber()));
                e newBuilder8 = LibraryProtos$LibraryProfileProto.b.newBuilder();
                newBuilder8.c(componentParams2.metricaApiKey);
                newBuilder7.g((LibraryProtos$LibraryProfileProto.b) newBuilder8.build());
                yoc[] yocVarArr = (yoc[]) hd20Var.c;
                ArrayList arrayList2 = new ArrayList(yocVarArr.length);
                for (yoc yocVar : yocVarArr) {
                    d newBuilder9 = LibraryProtos$LibraryProfileProto.a.newBuilder();
                    newBuilder9.d(tje.I(yocVar.a));
                    newBuilder9.c(tje.I(yocVar.b));
                    arrayList2.add((LibraryProtos$LibraryProfileProto.a) newBuilder9.build());
                }
                newBuilder7.c(kotlin.collections.a.J0(arrayList2));
                LibraryProtos$LibraryProfileProto libraryProtos$LibraryProfileProto = (LibraryProtos$LibraryProfileProto) newBuilder7.build();
                scy newBuilder10 = tcy.newBuilder();
                newBuilder10.d(libraryProtos$LibraryProfileProto);
                newBuilder.d((tcy) newBuilder10.build());
                arrayList.add(libraryProtos$LibraryProfileProto);
                i6++;
                i3 = 4;
                i4 = 3;
            }
        } catch (NoSuchAlgorithmException e) {
            ny61.o(e);
            throw null;
        }
    }

    public static void a(yku ykuVar, String str, String str2, nlu nluVar) {
        v820 v820Var = nluVar.a;
        ArrayList arrayList = ykuVar.a;
        dlu newBuilder = blu.newBuilder();
        newBuilder.e(str.concat(str2));
        try {
            newBuilder.f(ByteBuffer.wrap(MessageDigest.getInstance("MD5").digest(newBuilder.getName().getBytes(uza.a))).order(ByteOrder.BIG_ENDIAN).getLong());
            long j = v820Var.b.get();
            Long valueOf = Long.valueOf(j);
            if (j == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                newBuilder.g(valueOf.longValue());
            }
            newBuilder.d(v820Var.c.get());
            ArrayList arrayList2 = new ArrayList();
            pyl0 e = nluVar.e();
            while (!e.d()) {
                alu newBuilder2 = blu.a.newBuilder();
                newBuilder2.i(e.c());
                newBuilder2.h(e.e());
                int count = e.getCount();
                Integer valueOf2 = Integer.valueOf(count);
                if (count == 1) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    newBuilder2.g(valueOf2.intValue());
                }
                arrayList2.add(newBuilder2);
                e.next();
            }
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                alu aluVar = (alu) arrayList2.get(i);
                i++;
                if (i < arrayList2.size() && aluVar.e() == ((alu) arrayList2.get(i)).f()) {
                    aluVar.c();
                } else if (aluVar.e() == aluVar.f() + 1) {
                    aluVar.d();
                }
            }
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add((blu.a) ((alu) it.next()).build());
            }
            newBuilder.c(arrayList3);
            arrayList.add(newBuilder.build());
        } catch (NoSuchAlgorithmException e2) {
            ny61.o(e2);
        }
    }
}
