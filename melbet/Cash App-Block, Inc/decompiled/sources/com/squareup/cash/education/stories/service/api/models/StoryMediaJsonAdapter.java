package com.squareup.cash.education.stories.service.api.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/education/stories/service/api/models/StoryMediaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/education/stories/service/api/models/StoryMedia;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoryMediaJsonAdapter extends JsonAdapter {
    public final JsonReader.Options options;
    public final JsonAdapter storyPosterAdapter;

    public StoryMediaJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("poster");
        this.storyPosterAdapter = moshi.adapter(StoryPoster.class, EmptySet.INSTANCE, "poster");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        StoryPoster storyPoster = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (storyPoster = (StoryPoster) this.storyPosterAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("poster", "poster", jsonReader);
            }
        }
        jsonReader.endObject();
        if (storyPoster != null) {
            return new StoryMedia(storyPoster);
        }
        throw Util.missingProperty("poster", "poster", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        StoryMedia storyMedia = (StoryMedia) obj;
        jsonWriter.getClass();
        if (storyMedia == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("poster");
        this.storyPosterAdapter.toJson(jsonWriter, storyMedia.poster);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(32, "GeneratedJsonAdapter(StoryMedia)");
    }
}
