package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0645q8 implements Converter {
    public final C0558n8 a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0645q8(C0558n8 c0558n8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0558n8(null, 1, 0 == true ? 1 : 0) : c0558n8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0616p8 c0616p8) {
        ContentValues contentValues = new ContentValues();
        Long l = c0616p8.a;
        if (l != null) {
            contentValues.put("id", Long.valueOf(l.longValue()));
        }
        EnumC0718so enumC0718so = c0616p8.b;
        if (enumC0718so != null) {
            contentValues.put("type", Integer.valueOf(enumC0718so.a));
        }
        String str = c0616p8.c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C0558n8 c0558n8 = this.a;
        contentValues.put("session_description", MessageNano.toByteArray(c0558n8.a.fromModel(c0616p8.d)));
        return contentValues;
    }

    public C0645q8(C0558n8 c0558n8) {
        this.a = c0558n8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0645q8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0616p8 toModel(ContentValues contentValues) {
        EnumC0718so enumC0718so;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC0718so = EnumC0718so.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC0718so = EnumC0718so.BACKGROUND;
            }
        } else {
            enumC0718so = null;
        }
        return new C0616p8(asLong, enumC0718so, contentValues.getAsString("report_request_parameters"), this.a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
