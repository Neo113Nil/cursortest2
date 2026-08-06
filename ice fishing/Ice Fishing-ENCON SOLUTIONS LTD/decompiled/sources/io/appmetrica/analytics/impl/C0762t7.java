package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762t7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0685q7 f6937a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0762t7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0736s7 c0736s7) {
        ContentValues contentValues = new ContentValues();
        Long l2 = c0736s7.f6883a;
        if (l2 != null) {
            contentValues.put("id", Long.valueOf(l2.longValue()));
        }
        Vk vk = c0736s7.f6884b;
        if (vk != null) {
            contentValues.put("type", Integer.valueOf(vk.f5268a));
        }
        String str = c0736s7.f6885c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C0685q7 c0685q7 = this.f6937a;
        contentValues.put("session_description", MessageNano.toByteArray(c0685q7.f6768a.fromModel(c0736s7.f6886d)));
        return contentValues;
    }

    public C0762t7(C0685q7 c0685q7) {
        this.f6937a = c0685q7;
    }

    public /* synthetic */ C0762t7(C0685q7 c0685q7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0685q7(null, 1, null) : c0685q7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0736s7 toModel(ContentValues contentValues) {
        Vk vk;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            vk = Vk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                vk = Vk.BACKGROUND;
            }
        } else {
            vk = null;
        }
        return new C0736s7(asLong, vk, contentValues.getAsString("report_request_parameters"), this.f6937a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
