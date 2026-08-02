package bo.app;

import android.app.ApplicationExitInfo;
import androidx.arch.core.util.Function;
import androidx.room.TransactorKt;
import androidx.work.impl.model.WorkSpec;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.PrimitiveConstructor$PrimitiveConstructionFunction;
import com.google.crypto.tink.subtle.AesGcmJce;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes.dex */
public final /* synthetic */ class a$$ExternalSyntheticBUOutline0 implements Function, PrimitiveConstructor$PrimitiveConstructionFunction {
    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void m$1(Object obj, Object obj2, Object obj3, Object obj4, String str) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void m$2(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void m$3(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void m$4(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void m$5(String str) {
        throw new zzaeh(str);
    }

    public static /* synthetic */ void m$6(String str) {
        throw new GeneralSecurityException(str);
    }

    @Override // androidx.arch.core.util.Function
    /* renamed from: apply */
    public Object mo103apply(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkSpec.WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveConstructor$PrimitiveConstructionFunction
    public Object constructPrimitive(TransactorKt transactorKt) {
        return AesGcmJce.create((LegacyProtoKey) transactorKt);
    }

    public static /* synthetic */ void m$2(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void m$3(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void m$4(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void m$1(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void m$1() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void m$1(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void m$1(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void m() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void m(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void m$1(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void m(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m1430m(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo m(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new RuntimeException(th);
    }
}
