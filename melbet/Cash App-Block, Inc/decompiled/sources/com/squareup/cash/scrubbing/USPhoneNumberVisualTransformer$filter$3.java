package com.squareup.cash.scrubbing;

import androidx.compose.ui.text.input.OffsetMapping;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.intellij.markdown.parser.sequentialparsers.LocalParsingResult;

/* loaded from: classes10.dex */
public final class USPhoneNumberVisualTransformer$filter$3 implements OffsetMapping {
    public final ArrayList $originalToTransformed;
    public final ArrayList $transformedToOriginal;

    public USPhoneNumberVisualTransformer$filter$3() {
        this.$originalToTransformed = new ArrayList();
        this.$transformedToOriginal = new ArrayList();
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i) {
        ArrayList arrayList = this.$originalToTransformed;
        return ((Number) arrayList.get(RangesKt___RangesKt.coerceIn(i, CollectionsKt__CollectionsKt.getIndices(arrayList)))).intValue();
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i) {
        ArrayList arrayList = this.$transformedToOriginal;
        return ((Number) arrayList.get(RangesKt___RangesKt.coerceIn(i, CollectionsKt__CollectionsKt.getIndices(arrayList)))).intValue();
    }

    public void withFurtherProcessing(ArrayList arrayList) {
        this.$transformedToOriginal.add(arrayList);
    }

    public void withOtherParsingResult(LocalParsingResult localParsingResult) {
        this.$originalToTransformed.addAll(localParsingResult.parsedNodes);
        this.$transformedToOriginal.addAll(localParsingResult.rangesToProcessFurther);
    }

    public USPhoneNumberVisualTransformer$filter$3(ArrayList arrayList, ArrayList arrayList2) {
        this.$originalToTransformed = arrayList;
        this.$transformedToOriginal = arrayList2;
    }
}
