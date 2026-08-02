package com.squareup.cash.e2ee.signature;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/e2ee/signature/SignatureJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/e2ee/signature/Signature;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SignatureJsonAdapter extends JsonAdapter {
    public final JsonAdapter byteArrayAdapter;
    public final JsonAdapter listOfByteArrayAdapter;
    public final JsonReader.Options options;

    public SignatureJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("key", "certs");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.byteArrayAdapter = moshi.adapter(byte[].class, emptySet, "key");
        this.listOfByteArrayAdapter = moshi.adapter(Types.newParameterizedType(List.class, byte[].class), emptySet, "certs");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        byte[] bArr = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bArr = (byte[]) this.byteArrayAdapter.fromJson(jsonReader);
                if (bArr == null) {
                    throw Util.unexpectedNull("key", "key", jsonReader);
                }
            } else if (selectName == 1 && (list = (List) this.listOfByteArrayAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("certs", "certs", jsonReader);
            }
        }
        jsonReader.endObject();
        if (bArr == null) {
            throw Util.missingProperty("key", "key", jsonReader);
        }
        if (list != null) {
            return new Signature(list, bArr);
        }
        throw Util.missingProperty("certs", "certs", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Signature signature = (Signature) obj;
        jsonWriter.getClass();
        if (signature == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("key");
        this.byteArrayAdapter.toJson(jsonWriter, signature.key);
        jsonWriter.name("certs");
        this.listOfByteArrayAdapter.toJson(jsonWriter, signature.certs);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(31, "GeneratedJsonAdapter(Signature)");
    }
}
