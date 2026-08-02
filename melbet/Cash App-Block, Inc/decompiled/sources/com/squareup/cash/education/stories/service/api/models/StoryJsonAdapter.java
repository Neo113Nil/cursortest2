package com.squareup.cash.education.stories.service.api.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/education/stories/service/api/models/StoryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/education/stories/service/api/models/Story;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoryJsonAdapter extends JsonAdapter {
    public final JsonAdapter instantAdapter;
    public final JsonAdapter listOfSceneDataAdapter;
    public final JsonAdapter longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter storyMediaAdapter;
    public final JsonAdapter stringAdapter;

    public StoryJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("id", "url", "slug", "title", "media", "sceneData", "publishedAt", "priority");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.storyMediaAdapter = moshi.adapter(StoryMedia.class, emptySet, "media");
        this.listOfSceneDataAdapter = moshi.adapter(Types.newParameterizedType(List.class, SceneData.class), emptySet, "sceneData");
        this.instantAdapter = moshi.adapter(Instant.class, emptySet, "publishedAt");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "priority");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        StoryMedia storyMedia = null;
        List list = null;
        Instant instant = null;
        while (true) {
            Long l2 = l;
            String str5 = str;
            if (!jsonReader.hasNext()) {
                String str6 = str2;
                jsonReader.endObject();
                if (str5 == null) {
                    throw Util.missingProperty("id", "id", jsonReader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("url", "url", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("slug", "slug", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (storyMedia == null) {
                    throw Util.missingProperty("media", "media", jsonReader);
                }
                if (list == null) {
                    throw Util.missingProperty("sceneData", "sceneData", jsonReader);
                }
                if (instant == null) {
                    throw Util.missingProperty("publishedAt", "publishedAt", jsonReader);
                }
                if (l2 != null) {
                    return new Story(str5, str6, str3, str4, storyMedia, list, instant, l2.longValue());
                }
                throw Util.missingProperty("priority", "priority", jsonReader);
            }
            String str7 = str2;
            int selectName = jsonReader.selectName(this.options);
            JsonAdapter jsonAdapter = this.stringAdapter;
            switch (selectName) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    l = l2;
                    str2 = str7;
                    str = str5;
                case 0:
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    l = l2;
                    str2 = str7;
                case 1:
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("url", "url", jsonReader);
                    }
                    l = l2;
                    str = str5;
                case 2:
                    str3 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("slug", "slug", jsonReader);
                    }
                    l = l2;
                    str2 = str7;
                    str = str5;
                case 3:
                    str4 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    l = l2;
                    str2 = str7;
                    str = str5;
                case 4:
                    storyMedia = (StoryMedia) this.storyMediaAdapter.fromJson(jsonReader);
                    if (storyMedia == null) {
                        throw Util.unexpectedNull("media", "media", jsonReader);
                    }
                    l = l2;
                    str2 = str7;
                    str = str5;
                case 5:
                    list = (List) this.listOfSceneDataAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("sceneData", "sceneData", jsonReader);
                    }
                    l = l2;
                    str2 = str7;
                    str = str5;
                case 6:
                    instant = (Instant) this.instantAdapter.fromJson(jsonReader);
                    if (instant == null) {
                        throw Util.unexpectedNull("publishedAt", "publishedAt", jsonReader);
                    }
                    l = l2;
                    str2 = str7;
                    str = str5;
                case 7:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull("priority", "priority", jsonReader);
                    }
                    str2 = str7;
                    str = str5;
                default:
                    l = l2;
                    str2 = str7;
                    str = str5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Story story = (Story) obj;
        jsonWriter.getClass();
        if (story == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        String str = story.id;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("url");
        jsonAdapter.toJson(jsonWriter, story.url);
        jsonWriter.name("slug");
        jsonAdapter.toJson(jsonWriter, story.slug);
        jsonWriter.name("title");
        jsonAdapter.toJson(jsonWriter, story.title);
        jsonWriter.name("media");
        this.storyMediaAdapter.toJson(jsonWriter, story.media);
        jsonWriter.name("sceneData");
        this.listOfSceneDataAdapter.toJson(jsonWriter, story.sceneData);
        jsonWriter.name("publishedAt");
        this.instantAdapter.toJson(jsonWriter, story.publishedAt);
        jsonWriter.name("priority");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(story.priority));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(27, "GeneratedJsonAdapter(Story)");
    }
}
