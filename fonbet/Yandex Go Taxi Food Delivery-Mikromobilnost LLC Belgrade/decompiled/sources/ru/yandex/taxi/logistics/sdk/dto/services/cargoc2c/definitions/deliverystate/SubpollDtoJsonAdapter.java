package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PollUserAnswerChoiceDto;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SubpollDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SubpollDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollQuestionDto;", "listOfPollQuestionDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PollUserAnswerChoiceDto;", "nullableListOfPollUserAnswerChoiceDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SubpollDtoJsonAdapter extends JsonAdapter<SubpollDto> {
    private final JsonAdapter<List<PollQuestionDto>> listOfPollQuestionDtoAdapter;
    private final JsonAdapter<List<PollUserAnswerChoiceDto>> nullableListOfPollUserAnswerChoiceDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("questions", "root_question_id", "user_choices");
    private final JsonAdapter<String> stringAdapter;

    public SubpollDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, PollQuestionDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfPollQuestionDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "questions");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "rootQuestionId");
        this.nullableListOfPollUserAnswerChoiceDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, PollUserAnswerChoiceDto.class), emptySet, "userChoices");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SubpollDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<PollQuestionDto> list = null;
        String str = null;
        List<PollUserAnswerChoiceDto> list2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfPollQuestionDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("questions", "questions", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("rootQuestionId", "root_question_id", jsonReader);
                }
            } else if (selectName == 2) {
                list2 = this.nullableListOfPollUserAnswerChoiceDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("questions", "questions", jsonReader);
        }
        if (str != null) {
            return new SubpollDto(list, str, list2);
        }
        throw Util.missingProperty("rootQuestionId", "root_question_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SubpollDto subpollDto) {
        SubpollDto subpollDto2 = subpollDto;
        if (subpollDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("questions");
        this.listOfPollQuestionDtoAdapter.toJson(jsonWriter, (JsonWriter) subpollDto2.getQuestions());
        jsonWriter.name("root_question_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) subpollDto2.getRootQuestionId());
        jsonWriter.name("user_choices");
        this.nullableListOfPollUserAnswerChoiceDtoAdapter.toJson(jsonWriter, (JsonWriter) subpollDto2.getUserChoices());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(SubpollDto)");
    }
}
