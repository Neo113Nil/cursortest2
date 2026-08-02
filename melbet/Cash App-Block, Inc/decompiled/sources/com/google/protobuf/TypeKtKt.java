package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.TypeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/TypeKt$Dsl;", "", "block", "Lcom/google/protobuf/Type;", "-initializetype", "(Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Type;", "type", "copy", "(Lcom/google/protobuf/Type;Lkotlin/jvm/functions/Function1;)Lcom/google/protobuf/Type;", "Lcom/google/protobuf/TypeOrBuilder;", "Lcom/google/protobuf/SourceContext;", "getSourceContextOrNull", "(Lcom/google/protobuf/TypeOrBuilder;)Lcom/google/protobuf/SourceContext;", "sourceContextOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TypeKtKt {
    /* renamed from: -initializetype, reason: not valid java name */
    public static final Type m2096initializetype(Function1<? super TypeKt.Dsl, Unit> function1) {
        function1.getClass();
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.INSTANCE;
        Type.Builder newBuilder = Type.newBuilder();
        newBuilder.getClass();
        TypeKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    public static final Type copy(Type type2, Function1<? super TypeKt.Dsl, Unit> function1) {
        type2.getClass();
        function1.getClass();
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.INSTANCE;
        Type.Builder builder = type2.toBuilder();
        builder.getClass();
        TypeKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(TypeOrBuilder typeOrBuilder) {
        typeOrBuilder.getClass();
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}
