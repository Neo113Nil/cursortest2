package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.m8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0455m8 implements Converter {
    public final C0368j8 a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0455m8(C0368j8 c0368j8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0368j8(null, 1, 0 == true ? 1 : 0) : c0368j8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull C0426l8 c0426l8) {
        ContentValues contentValues = new ContentValues();
        Long l = c0426l8.a;
        if (l != null) {
            contentValues.put(ConnectableDevice.KEY_ID, Long.valueOf(l.longValue()));
        }
        Xn xn = c0426l8.b;
        if (xn != null) {
            contentValues.put("type", Integer.valueOf(xn.a));
        }
        String str = c0426l8.c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C0368j8 c0368j8 = this.a;
        contentValues.put("session_description", MessageNano.toByteArray(c0368j8.a.fromModel(c0426l8.d)));
        return contentValues;
    }

    public C0455m8(@NotNull C0368j8 c0368j8) {
        this.a = c0368j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0455m8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0426l8 toModel(@NotNull ContentValues contentValues) {
        Xn xn;
        Long asLong = contentValues.getAsLong(ConnectableDevice.KEY_ID);
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            xn = Xn.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                xn = Xn.BACKGROUND;
            }
        } else {
            xn = null;
        }
        return new C0426l8(asLong, xn, contentValues.getAsString("report_request_parameters"), this.a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
