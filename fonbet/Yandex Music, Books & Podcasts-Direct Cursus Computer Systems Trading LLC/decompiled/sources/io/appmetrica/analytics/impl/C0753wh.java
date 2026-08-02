package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0753wh implements ProtobufConverter {
    public final Lh a;

    public C0753wh() {
        this(new Lh());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ih fromModel(@NonNull C0810yh c0810yh) {
        Ih ih = new Ih();
        if (!TextUtils.isEmpty(c0810yh.a)) {
            ih.a = c0810yh.a;
        }
        ih.b = c0810yh.b.toString();
        ih.c = this.a.fromModel(c0810yh.c).intValue();
        return ih;
    }

    public C0753wh(Lh lh) {
        this.a = lh;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0810yh toModel(@NonNull Ih ih) {
        JSONObject jSONObject;
        String str = ih.a;
        String str2 = ih.b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0810yh(str, jSONObject, this.a.toModel(Integer.valueOf(ih.c)));
        }
        jSONObject = new JSONObject();
        return new C0810yh(str, jSONObject, this.a.toModel(Integer.valueOf(ih.c)));
    }
}
