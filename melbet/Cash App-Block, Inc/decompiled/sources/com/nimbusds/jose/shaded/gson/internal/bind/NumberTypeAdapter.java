package com.nimbusds.jose.shaded.gson.internal.bind;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import com.nimbusds.jose.shaded.gson.TypeAdapter;
import com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public final class NumberTypeAdapter extends TypeAdapter {
    public static final TypeAdapters.AnonymousClass31 LAZILY_PARSED_NUMBER_FACTORY = new TypeAdapters.AnonymousClass31(new NumberTypeAdapter(2), 1);
    public final int toNumberStrategy;

    public NumberTypeAdapter(int i) {
        this.toNumberStrategy = i;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        int peek = jsonReader.peek();
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(peek);
        if (ordinal == 5 || ordinal == 6) {
            return SVG$Unit$EnumUnboxingLocalUtility._dispatch_readNumber(this.toNumberStrategy, jsonReader);
        }
        if (ordinal == 8) {
            jsonReader.nextNull();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + SVG$Unit$EnumUnboxingLocalUtility.stringValueOf(peek) + "; at path " + jsonReader.getPath(false));
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        jsonWriter.value((Number) obj);
    }
}
