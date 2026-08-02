package com.google.protobuf;

import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/StringValueKt$Dsl;", "", "block", "Lcom/google/protobuf/StringValue;", "-initializestringValue", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/StringValue;", "stringValue", "copy", "(Lcom/google/protobuf/StringValue;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/StringValue;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringValueKtKt {
    /* renamed from: -initializestringValue, reason: not valid java name */
    public static final StringValue m2093initializestringValue(Function1<? super StringValueKt.Dsl, Unit> function1) {
        function1.getClass();
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.INSTANCE;
        StringValue.Builder newBuilder = StringValue.newBuilder();
        newBuilder.getClass();
        StringValueKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    public static final StringValue copy(StringValue stringValue, Function1<? super StringValueKt.Dsl, Unit> function1) {
        stringValue.getClass();
        function1.getClass();
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.INSTANCE;
        StringValue.Builder builder = stringValue.toBuilder();
        builder.getClass();
        StringValueKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }
}
