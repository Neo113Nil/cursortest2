package ru.yandex.taxi.logistics.sdk.tracking.impl.data;

import defpackage.k4o;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes5.dex */
public final class NeuroPostcardShownStagesRepository {
    public final LinkedHashMap a = new LinkedHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/impl/data/NeuroPostcardShownStagesRepository$PostcardStage;", "", "INITIAL", "EDITING", "SENDING", "COMPLETED", "UNKNOWN", MetaDataField.SCREEN_FIELD}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PostcardStage {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PostcardStage[] $VALUES;
        public static final PostcardStage COMPLETED;
        public static final PostcardStage EDITING;
        public static final PostcardStage INITIAL;
        public static final PostcardStage SENDING;
        public static final PostcardStage UNKNOWN;

        static {
            PostcardStage postcardStage = new PostcardStage("INITIAL", 0);
            INITIAL = postcardStage;
            PostcardStage postcardStage2 = new PostcardStage("EDITING", 1);
            EDITING = postcardStage2;
            PostcardStage postcardStage3 = new PostcardStage("SENDING", 2);
            SENDING = postcardStage3;
            PostcardStage postcardStage4 = new PostcardStage("COMPLETED", 3);
            COMPLETED = postcardStage4;
            PostcardStage postcardStage5 = new PostcardStage("UNKNOWN", 4);
            UNKNOWN = postcardStage5;
            PostcardStage[] postcardStageArr = {postcardStage, postcardStage2, postcardStage3, postcardStage4, postcardStage5};
            $VALUES = postcardStageArr;
            $ENTRIES = kotlin.enums.a.a(postcardStageArr);
        }

        public static PostcardStage valueOf(String str) {
            return (PostcardStage) Enum.valueOf(PostcardStage.class, str);
        }

        public static PostcardStage[] values() {
            return (PostcardStage[]) $VALUES.clone();
        }
    }
}
