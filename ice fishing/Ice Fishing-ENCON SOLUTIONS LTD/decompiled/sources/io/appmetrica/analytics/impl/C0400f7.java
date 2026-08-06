package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400f7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0323c7 f5965a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0400f7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0374e7 c0374e7) {
        ContentValues contentValues = new ContentValues();
        Long l2 = c0374e7.f5868a;
        if (l2 != null) {
            contentValues.put("session_id", Long.valueOf(l2.longValue()));
        }
        Vk vk = c0374e7.f5869b;
        if (vk != null) {
            contentValues.put("session_type", Integer.valueOf(vk.f5268a));
        }
        Long l3 = c0374e7.f5870c;
        if (l3 != null) {
            contentValues.put("number_in_session", Long.valueOf(l3.longValue()));
        }
        EnumC0301bb enumC0301bb = c0374e7.f5871d;
        if (enumC0301bb != null) {
            contentValues.put("type", Integer.valueOf(enumC0301bb.f5664a));
        }
        Long l4 = c0374e7.f5872e;
        if (l4 != null) {
            contentValues.put("global_number", Long.valueOf(l4.longValue()));
        }
        Long l5 = c0374e7.f5873f;
        if (l5 != null) {
            contentValues.put("time", Long.valueOf(l5.longValue()));
        }
        C0323c7 c0323c7 = this.f5965a;
        contentValues.put("event_description", MessageNano.toByteArray(c0323c7.f5727a.fromModel(c0374e7.f5874g)));
        return contentValues;
    }

    public C0400f7(C0323c7 c0323c7) {
        this.f5965a = c0323c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0400f7(C0323c7 c0323c7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0323c7(null, 1, 0 == true ? 1 : 0) : c0323c7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0374e7 toModel(ContentValues contentValues) {
        Vk vk;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            vk = Vk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                vk = Vk.BACKGROUND;
            }
        } else {
            vk = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C0374e7(asLong, vk, asLong2, asInteger2 != null ? EnumC0301bb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f5965a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
