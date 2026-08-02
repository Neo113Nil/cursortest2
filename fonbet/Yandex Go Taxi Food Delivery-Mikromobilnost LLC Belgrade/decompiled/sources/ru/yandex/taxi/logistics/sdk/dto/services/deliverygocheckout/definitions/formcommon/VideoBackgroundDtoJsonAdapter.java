package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/VideoBackgroundDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/VideoBackgroundDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableDoubleAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ScaleTypeDto;", "nullableScaleTypeDtoAdapter", "", "booleanAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundContentWrapperDto;", "nullableBackgroundContentWrapperDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VideoBackgroundDtoJsonAdapter extends JsonAdapter<VideoBackgroundDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<VideoBackgroundDto> constructorRef;
    private final JsonAdapter<BackgroundContentWrapperDto> nullableBackgroundContentWrapperDtoAdapter;
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<ScaleTypeDto> nullableScaleTypeDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("video_url", CaretView.ALPHA_PROPERTY, "scale_type", "loop", "muted", "preview_content");
    private final JsonAdapter<String> stringAdapter;

    public VideoBackgroundDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "videoUrl");
        this.nullableDoubleAdapter = moshi.adapter(Double.class, emptySet, CaretView.ALPHA_PROPERTY);
        this.nullableScaleTypeDtoAdapter = moshi.adapter(ScaleTypeDto.class, emptySet, "scaleType");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "loop");
        this.nullableBackgroundContentWrapperDtoAdapter = moshi.adapter(BackgroundContentWrapperDto.class, emptySet, "previewContent");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final VideoBackgroundDto fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        ScaleTypeDto scaleTypeDto = null;
        int i = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Double d = null;
        String str = null;
        BackgroundContentWrapperDto backgroundContentWrapperDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("videoUrl", "video_url", jsonReader);
                    }
                    break;
                case 1:
                    d = this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    scaleTypeDto = this.nullableScaleTypeDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("loop", "loop", jsonReader);
                    }
                    i &= -9;
                    break;
                case 4:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("muted", "muted", jsonReader);
                    }
                    i &= -17;
                    break;
                case 5:
                    backgroundContentWrapperDto = this.nullableBackgroundContentWrapperDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -25) {
            if (str == null) {
                throw Util.missingProperty("videoUrl", "video_url", jsonReader);
            }
            return new VideoBackgroundDto(str, d, scaleTypeDto, bool2.booleanValue(), bool3.booleanValue(), backgroundContentWrapperDto);
        }
        Constructor<VideoBackgroundDto> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = VideoBackgroundDto.class.getDeclaredConstructor(String.class, Double.class, ScaleTypeDto.class, cls3, cls3, BackgroundContentWrapperDto.class, cls, cls2);
            this.constructorRef = constructor;
        }
        Constructor<VideoBackgroundDto> constructor2 = constructor;
        if (str == null) {
            throw Util.missingProperty("videoUrl", "video_url", jsonReader);
        }
        return constructor2.newInstance(str, d, scaleTypeDto, bool2, bool3, backgroundContentWrapperDto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, VideoBackgroundDto videoBackgroundDto) {
        VideoBackgroundDto videoBackgroundDto2 = videoBackgroundDto;
        if (videoBackgroundDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("video_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) videoBackgroundDto2.getVideoUrl());
        jsonWriter.name(CaretView.ALPHA_PROPERTY);
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) videoBackgroundDto2.getAlpha());
        jsonWriter.name("scale_type");
        this.nullableScaleTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) videoBackgroundDto2.getScaleType());
        jsonWriter.name("loop");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(videoBackgroundDto2.getLoop()));
        jsonWriter.name("muted");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(videoBackgroundDto2.getMuted()));
        jsonWriter.name("preview_content");
        this.nullableBackgroundContentWrapperDtoAdapter.toJson(jsonWriter, (JsonWriter) videoBackgroundDto2.getPreviewContent());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(VideoBackgroundDto)");
    }
}
