package com.google.android.datatransport.runtime;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.caverock.androidsvg.SVG;
import com.datadog.trace.api.cache.DDPartialKeyCache$Hasher;
import com.datadog.trace.core.propagation.ptags.TagElement;
import com.datadog.trace.core.propagation.ptags.TagValue;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.fidesmo.sec.devices.Device;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.gms.internal.measurement.zzaeg;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.libraries.places.internal.zzbkd;
import com.google.firebase.encoders.EncodingException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class TransportImpl$$ExternalSyntheticLambda0 implements DDPartialKeyCache$Hasher, Function, Predicate, BiFunction, SQLiteEventStore.Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TransportImpl$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + ((Object) obj.toString()));
    }

    public static /* synthetic */ void m$1(int i, Object obj, Object obj2, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public Object mo39apply(Object obj) {
        ObservableSource lambda$getTransceiveCall$8;
        ObservableSource lambda$getTransceiveCall$12;
        ObservableSource lambda$retryCall$20;
        switch (this.$r8$classId) {
            case 11:
                lambda$getTransceiveCall$8 = ServiceDeliveryClient.lambda$getTransceiveCall$8((Observable) obj);
                return lambda$getTransceiveCall$8;
            case 12:
                lambda$getTransceiveCall$12 = ServiceDeliveryClient.lambda$getTransceiveCall$12((Observable) obj);
                return lambda$getTransceiveCall$12;
            case 13:
            case 14:
            default:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        SVG builder = AutoValue_TransportContext.builder();
                        builder.setBackendName(rawQuery.getString(1));
                        builder.idToElementMap = PriorityMapping.valueOf(rawQuery.getInt(2));
                        String string2 = rawQuery.getString(3);
                        builder.cssRules = string2 == null ? null : Base64.decode(string2, 0);
                        arrayList.add(builder.build());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 15:
                lambda$retryCall$20 = ServiceDeliveryClient.lambda$retryCall$20((Observable) obj);
                return lambda$retryCall$20;
        }
    }

    public char convert(char c) {
        switch (this.$r8$classId) {
            case 6:
                return c;
            case 7:
                return TagValue.convertW3CtoDD(c);
            default:
                return TagValue.convertDDtoW3C(c);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean lambda$getTransceiveCall$11;
        boolean lambda$getTransceiveCall$7;
        List list = (List) obj;
        switch (this.$r8$classId) {
            case 13:
                lambda$getTransceiveCall$11 = ServiceDeliveryClient.lambda$getTransceiveCall$11(list);
                return lambda$getTransceiveCall$11;
            default:
                lambda$getTransceiveCall$7 = ServiceDeliveryClient.lambda$getTransceiveCall$7(list);
                return lambda$getTransceiveCall$7;
        }
    }

    public static /* synthetic */ void m$1(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m$1() {
        throw new zzbkd();
    }

    public static /* synthetic */ void m$1(String str) {
        throw new EncodingException(str);
    }

    public static /* synthetic */ void m(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Length too large: ");
        sb.append(i2);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Source subfield ");
        sb.append(i2);
        sb.append((Object) " is present but null: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m() {
        throw new zzaeg();
    }

    public static /* synthetic */ void m(int i, Object obj, Object obj2, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(long j, Object obj, int i) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new zzer(str);
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new RuntimeRemoteException(th);
    }

    @Override // com.datadog.trace.api.cache.DDPartialKeyCache$Hasher
    public int apply(int i, int i2, Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        int min = Integer.min(charSequence.length(), i2);
        int i3 = 0;
        if (i >= 0 && min > 0) {
            while (i < min) {
                i3 = (i3 * 31) + TagValue.convertDDtoW3C(charSequence.charAt(i));
                i++;
            }
        }
        return i3;
    }

    public Object apply(int i, int i2, Object obj, int i3) {
        switch (this.$r8$classId) {
            case 2:
                return new TagValue(TagElement.Encoding.W3C, i, (CharSequence) obj, i2, i3);
            default:
                return new TagValue(TagElement.Encoding.DATADOG, i, (CharSequence) obj, i2, i3);
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Observable apply(Object obj, Object obj2) {
        return ((Device) obj).transceive((List<byte[]>) obj2);
    }
}
