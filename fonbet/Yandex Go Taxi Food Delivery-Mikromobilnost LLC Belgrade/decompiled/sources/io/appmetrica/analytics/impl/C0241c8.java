package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* renamed from: io.appmetrica.analytics.impl.c8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0241c8 implements Converter {
    public final Z7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0241c8(Z7 z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Z7(null, 1, 0 == true ? 1 : 0) : z7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0212b8 c0212b8) {
        ContentValues contentValues = new ContentValues();
        Long l = c0212b8.a;
        if (l != null) {
            contentValues.put("session_id", Long.valueOf(l.longValue()));
        }
        EnumC0718so enumC0718so = c0212b8.b;
        if (enumC0718so != null) {
            contentValues.put("session_type", Integer.valueOf(enumC0718so.a));
        }
        Long l2 = c0212b8.c;
        if (l2 != null) {
            contentValues.put("number_in_session", Long.valueOf(l2.longValue()));
        }
        Hc hc = c0212b8.d;
        if (hc != null) {
            contentValues.put("type", Integer.valueOf(hc.a));
        }
        Long l3 = c0212b8.e;
        if (l3 != null) {
            contentValues.put("global_number", Long.valueOf(l3.longValue()));
        }
        Long l4 = c0212b8.f;
        if (l4 != null) {
            contentValues.put(RemoteBioParameters.TIME, Long.valueOf(l4.longValue()));
        }
        Z7 z7 = this.a;
        contentValues.put("event_description", MessageNano.toByteArray(z7.a.fromModel(c0212b8.g)));
        return contentValues;
    }

    public C0241c8(Z7 z7) {
        this.a = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0241c8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0212b8 toModel(ContentValues contentValues) {
        EnumC0718so enumC0718so;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC0718so = EnumC0718so.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC0718so = EnumC0718so.BACKGROUND;
            }
        } else {
            enumC0718so = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C0212b8(asLong, enumC0718so, asLong2, asInteger2 != null ? Hc.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong(RemoteBioParameters.TIME), this.a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
