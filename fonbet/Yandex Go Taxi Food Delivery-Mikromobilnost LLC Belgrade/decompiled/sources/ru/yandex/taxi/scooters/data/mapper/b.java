package ru.yandex.taxi.scooters.data.mapper;

import android.content.Context;
import defpackage.dvw;
import defpackage.j18;
import defpackage.kgb0;
import defpackage.kpm0;
import defpackage.l60;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.zgz;
import defpackage.zv91;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.yandex.taxi.scooters.data.model.PhotoType;
import ru.yandex.taxi.scooters.domain.model.ScootersActualizationFailedException;

/* loaded from: classes6.dex */
public final class b {
    public final Context a;

    public b(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x013f -> B:10:0x0143). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, PhotoType photoType, ContinuationImpl continuationImpl) {
        ScootersActualizationMapper$map$1 scootersActualizationMapper$map$1;
        int i;
        Iterator it;
        ScootersActualizationMapper$map$1 scootersActualizationMapper$map$12;
        Object obj;
        String str2;
        PhotoType photoType2;
        ?? r13;
        b bVar = this;
        if (continuationImpl instanceof ScootersActualizationMapper$map$1) {
            scootersActualizationMapper$map$1 = (ScootersActualizationMapper$map$1) continuationImpl;
            int i2 = scootersActualizationMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersActualizationMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersActualizationMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersActualizationMapper$map$1.label;
                int i3 = 1;
                String str3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list2 = list;
                    Object arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    scootersActualizationMapper$map$12 = scootersActualizationMapper$map$1;
                    obj = arrayList;
                    str2 = str;
                    photoType2 = photoType;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r4 = (Collection) scootersActualizationMapper$map$1.L$11;
                    String str4 = (String) scootersActualizationMapper$map$1.L$10;
                    String str5 = (String) scootersActualizationMapper$map$1.L$9;
                    kpm0 kpm0Var = (kpm0) scootersActualizationMapper$map$1.L$8;
                    it = (Iterator) scootersActualizationMapper$map$1.L$6;
                    Object obj3 = (Collection) scootersActualizationMapper$map$1.L$5;
                    PhotoType photoType3 = (PhotoType) scootersActualizationMapper$map$1.L$2;
                    kotlin.b.b(obj2);
                    scootersActualizationMapper$map$12 = scootersActualizationMapper$map$1;
                    str2 = str4;
                    int i4 = 1;
                    Object obj4 = obj3;
                    r4.add(new kgb0(str5, (String) obj2, kpm0Var.b));
                    bVar = this;
                    i3 = i4;
                    obj = obj4;
                    photoType2 = photoType3;
                    str3 = null;
                    if (it.hasNext()) {
                        kpm0Var = (kpm0) it.next();
                        String str6 = kpm0Var.b;
                        scootersActualizationMapper$map$12.L$0 = str3;
                        scootersActualizationMapper$map$12.L$1 = str3;
                        scootersActualizationMapper$map$12.L$2 = photoType2;
                        scootersActualizationMapper$map$12.L$3 = str3;
                        scootersActualizationMapper$map$12.L$4 = str3;
                        scootersActualizationMapper$map$12.L$5 = obj;
                        scootersActualizationMapper$map$12.L$6 = it;
                        scootersActualizationMapper$map$12.L$7 = str3;
                        scootersActualizationMapper$map$12.L$8 = kpm0Var;
                        scootersActualizationMapper$map$12.L$9 = str6;
                        scootersActualizationMapper$map$12.L$10 = str2;
                        scootersActualizationMapper$map$12.L$11 = obj;
                        scootersActualizationMapper$map$12.label = i3;
                        j18 j18Var = new j18(i3, dvw.b(scootersActualizationMapper$map$12));
                        j18Var.u();
                        try {
                        } catch (FileNotFoundException e) {
                            zgz.a(str3, e);
                            r13 = str3;
                        }
                        r13 = bVar.a.getContentResolver().openInputStream(kpm0Var.a);
                        if (r13 == 0) {
                            j18Var.resumeWith(new Result.Failure(new ScootersActualizationFailedException()));
                            i4 = i3;
                        } else {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                byte[] bArr = new byte[1024];
                                i4 = i3;
                                int i5 = 0;
                                for (int read = r13.read(bArr, 0, 1024); read > -1; read = r13.read(bArr, 0, 1024)) {
                                    messageDigest.update(bArr, 0, read);
                                }
                                byte[] digest = messageDigest.digest();
                                char[] cArr = new char[digest.length << 1];
                                int length = digest.length;
                                int i6 = 0;
                                while (i5 < length) {
                                    byte[] bArr2 = digest;
                                    byte b = bArr2[i5];
                                    int i7 = i6 + 1;
                                    char[] cArr2 = zv91.a;
                                    cArr[i6] = cArr2[(b & 240) >>> 4];
                                    i6 += 2;
                                    cArr[i7] = cArr2[b & PKIBody._CCP];
                                    i5++;
                                    digest = bArr2;
                                }
                                j18Var.resumeWith(new String(cArr));
                                r13.close();
                            } finally {
                            }
                        }
                        obj2 = j18Var.s();
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        photoType3 = photoType2;
                        r4 = obj;
                        str5 = str6;
                        obj4 = r4;
                        r4.add(new kgb0(str5, (String) obj2, kpm0Var.b));
                        bVar = this;
                        i3 = i4;
                        obj = obj4;
                        photoType2 = photoType3;
                        str3 = null;
                        if (it.hasNext()) {
                            return new l60(str2, (List) obj, photoType2);
                        }
                    }
                }
            }
        }
        scootersActualizationMapper$map$1 = new ScootersActualizationMapper$map$1(bVar, continuationImpl);
        Object obj22 = scootersActualizationMapper$map$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersActualizationMapper$map$1.label;
        int i32 = 1;
        String str32 = null;
        if (i != 0) {
        }
    }
}
