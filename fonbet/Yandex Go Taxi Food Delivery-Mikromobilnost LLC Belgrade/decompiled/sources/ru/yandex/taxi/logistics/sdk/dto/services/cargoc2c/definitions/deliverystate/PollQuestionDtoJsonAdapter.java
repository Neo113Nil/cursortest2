package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PollQuestionDto;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto$ChoicesTypeDto;", "choicesTypeDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionAnswerDto;", "listOfPollQuestionAnswerDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto$AnswersAlignmentDto;", "answersAlignmentDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PollQuestionDtoJsonAdapter extends JsonAdapter<PollQuestionDto> {
    private final JsonAdapter<PollQuestionDto.AnswersAlignmentDto> answersAlignmentDtoAdapter;
    private final JsonAdapter<PollQuestionDto.ChoicesTypeDto> choicesTypeDtoAdapter;
    private volatile Constructor<PollQuestionDto> constructorRef;
    private final JsonAdapter<List<PollQuestionAnswerDto>> listOfPollQuestionAnswerDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "choices_type", "text", "answers", "answers_alignment");
    private final JsonAdapter<String> stringAdapter;

    public PollQuestionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.choicesTypeDtoAdapter = moshi.adapter(PollQuestionDto.ChoicesTypeDto.class, emptySet, "choicesType");
        this.listOfPollQuestionAnswerDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PollQuestionAnswerDto.class), emptySet, "answers");
        this.answersAlignmentDtoAdapter = moshi.adapter(PollQuestionDto.AnswersAlignmentDto.class, emptySet, "answersAlignment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PollQuestionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        PollQuestionDto.ChoicesTypeDto choicesTypeDto = null;
        String str2 = null;
        List<PollQuestionAnswerDto> list = null;
        PollQuestionDto.AnswersAlignmentDto answersAlignmentDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("id", "id", jsonReader);
                }
            } else if (selectName == 1) {
                choicesTypeDto = this.choicesTypeDtoAdapter.fromJson(jsonReader);
                if (choicesTypeDto == null) {
                    throw Util.unexpectedNull("choicesType", "choices_type", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 3) {
                list = this.listOfPollQuestionAnswerDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("answers", "answers", jsonReader);
                }
            } else if (selectName == 4) {
                answersAlignmentDto = this.answersAlignmentDtoAdapter.fromJson(jsonReader);
                if (answersAlignmentDto == null) {
                    throw Util.unexpectedNull("answersAlignment", "answers_alignment", jsonReader);
                }
                i = -17;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -17) {
            PollQuestionDto.AnswersAlignmentDto answersAlignmentDto2 = answersAlignmentDto;
            List<PollQuestionAnswerDto> list2 = list;
            String str3 = str2;
            PollQuestionDto.ChoicesTypeDto choicesTypeDto2 = choicesTypeDto;
            String str4 = str;
            if (str4 == null) {
                throw Util.missingProperty("id", "id", jsonReader);
            }
            if (choicesTypeDto2 == null) {
                throw Util.missingProperty("choicesType", "choices_type", jsonReader);
            }
            if (str3 == null) {
                throw Util.missingProperty("text", "text", jsonReader);
            }
            if (list2 != null) {
                return new PollQuestionDto(str4, choicesTypeDto2, str3, list2, answersAlignmentDto2);
            }
            throw Util.missingProperty("answers", "answers", jsonReader);
        }
        PollQuestionDto.AnswersAlignmentDto answersAlignmentDto3 = answersAlignmentDto;
        List<PollQuestionAnswerDto> list3 = list;
        String str5 = str2;
        PollQuestionDto.ChoicesTypeDto choicesTypeDto3 = choicesTypeDto;
        String str6 = str;
        Constructor<PollQuestionDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PollQuestionDto.class.getDeclaredConstructor(String.class, PollQuestionDto.ChoicesTypeDto.class, String.class, List.class, PollQuestionDto.AnswersAlignmentDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str6 == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (choicesTypeDto3 == null) {
            throw Util.missingProperty("choicesType", "choices_type", jsonReader);
        }
        if (str5 == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (list3 != null) {
            return constructor.newInstance(str6, choicesTypeDto3, str5, list3, answersAlignmentDto3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("answers", "answers", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PollQuestionDto pollQuestionDto) {
        PollQuestionDto pollQuestionDto2 = pollQuestionDto;
        if (pollQuestionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pollQuestionDto2.getId());
        jsonWriter.name("choices_type");
        this.choicesTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) pollQuestionDto2.getChoicesType());
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pollQuestionDto2.getText());
        jsonWriter.name("answers");
        this.listOfPollQuestionAnswerDtoAdapter.toJson(jsonWriter, (JsonWriter) pollQuestionDto2.getAnswers());
        jsonWriter.name("answers_alignment");
        this.answersAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) pollQuestionDto2.getAnswersAlignment());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(PollQuestionDto)");
    }
}
