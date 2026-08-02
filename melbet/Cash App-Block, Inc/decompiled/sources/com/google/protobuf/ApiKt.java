package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ApiKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiKt {
    public static final ApiKt INSTANCE = new ApiKt();

    private ApiKt() {
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0018\b\u0007\u0018\u0000 R2\u00020\u0001:\u0004RSTUB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010/\u001a\u000200H\u0001J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000202J\u0006\u00104\u001a\u000202J\u0006\u00105\u001a\u000202J\u0006\u00106\u001a\u000207J%\u00108\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b9J%\u00108\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0002\b:J%\u00108\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\u000f\u001a\u00020\u0017H\u0007¢\u0006\u0002\b;J+\u0010<\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070>H\u0007¢\u0006\u0002\b?J+\u0010<\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0>H\u0007¢\u0006\u0002\b@J+\u0010<\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00170>H\u0007¢\u0006\u0002\bAJ\u001d\u0010B\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0002\bCJ\u001d\u0010B\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0006H\u0007¢\u0006\u0002\bDJ\u001d\u0010B\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0006H\u0007¢\u0006\u0002\bEJ&\u0010F\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0087\n¢\u0006\u0002\bGJ,\u0010F\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070>H\u0087\n¢\u0006\u0002\bHJ&\u0010F\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0087\n¢\u0006\u0002\bIJ,\u0010F\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0>H\u0087\n¢\u0006\u0002\bJJ&\u0010F\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\u000f\u001a\u00020\u0017H\u0087\n¢\u0006\u0002\bKJ,\u0010F\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00170>H\u0087\n¢\u0006\u0002\bLJ.\u0010M\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010N\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0002\bOJ.\u0010M\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010N\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\bPJ.\u0010M\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010N\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u0017H\u0087\u0002¢\u0006\u0002\bQR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\nR$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015¨\u0006V"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Api$Builder;", "(Lcom/google/protobuf/Api$Builder;)V", "methods", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Method;", "Lcom/google/protobuf/ApiKt$Dsl$MethodsProxy;", "getMethods", "()Lcom/google/protobuf/kotlin/DslList;", "mixins", "Lcom/google/protobuf/Mixin;", "Lcom/google/protobuf/ApiKt$Dsl$MixinsProxy;", "getMixins", "value", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "options", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/ApiKt$Dsl$OptionsProxy;", "getOptions", "Lcom/google/protobuf/SourceContext;", "sourceContext", "getSourceContext", "()Lcom/google/protobuf/SourceContext;", "setSourceContext", "(Lcom/google/protobuf/SourceContext;)V", "Lcom/google/protobuf/Syntax;", "syntax", "getSyntax", "()Lcom/google/protobuf/Syntax;", "setSyntax", "(Lcom/google/protobuf/Syntax;)V", "", "syntaxValue", "getSyntaxValue", "()I", "setSyntaxValue", "(I)V", "version", "getVersion", "setVersion", "_build", "Lcom/google/protobuf/Api;", "clearName", "", "clearSourceContext", "clearSyntax", "clearVersion", "hasSourceContext", "", "add", "addMethods", "addMixins", "addOptions", "addAll", "values", "", "addAllMethods", "addAllMixins", "addAllOptions", "clear", "clearMethods", "clearMixins", "clearOptions", "plusAssign", "plusAssignMethods", "plusAssignAllMethods", "plusAssignMixins", "plusAssignAllMixins", "plusAssignOptions", "plusAssignAllOptions", "set", "index", "setMethods", "setMixins", "setOptions", "Companion", "MethodsProxy", "MixinsProxy", "OptionsProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Api.Builder _builder;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$MethodsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class MethodsProxy extends DslProxy {
            private MethodsProxy() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$MixinsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class MixinsProxy extends DslProxy {
            private MixinsProxy() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Api.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Api _build() {
            Api build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllMethods(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllMethods(iterable);
        }

        public final /* synthetic */ void addAllMixins(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllMixins(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addMethods(DslList dslList, Method method) {
            dslList.getClass();
            method.getClass();
            this._builder.addMethods(method);
        }

        public final /* synthetic */ void addMixins(DslList dslList, Mixin mixin) {
            dslList.getClass();
            mixin.getClass();
            this._builder.addMixins(mixin);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            dslList.getClass();
            option.getClass();
            this._builder.addOptions(option);
        }

        public final /* synthetic */ void clearMethods(DslList dslList) {
            dslList.getClass();
            this._builder.clearMethods();
        }

        public final /* synthetic */ void clearMixins(DslList dslList) {
            dslList.getClass();
            this._builder.clearMixins();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            dslList.getClass();
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final /* synthetic */ DslList getMethods() {
            List<Method> methodsList = this._builder.getMethodsList();
            methodsList.getClass();
            return new DslList(methodsList);
        }

        public final /* synthetic */ DslList getMixins() {
            List<Mixin> mixinsList = this._builder.getMixinsList();
            mixinsList.getClass();
            return new DslList(mixinsList);
        }

        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            optionsList.getClass();
            return new DslList(optionsList);
        }

        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            sourceContext.getClass();
            return sourceContext;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            syntax.getClass();
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final String getVersion() {
            String version = this._builder.getVersion();
            version.getClass();
            return version;
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllMethods(DslList<Method, MethodsProxy> dslList, Iterable<Method> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllMethods(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllMixins(DslList<Mixin, MixinsProxy> dslList, Iterable<Mixin> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllMixins(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignMethods(DslList<Method, MethodsProxy> dslList, Method method) {
            dslList.getClass();
            method.getClass();
            addMethods(dslList, method);
        }

        public final /* synthetic */ void plusAssignMixins(DslList<Mixin, MixinsProxy> dslList, Mixin mixin) {
            dslList.getClass();
            mixin.getClass();
            addMixins(dslList, mixin);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            dslList.getClass();
            option.getClass();
            addOptions(dslList, option);
        }

        public final /* synthetic */ void setMethods(DslList dslList, int i, Method method) {
            dslList.getClass();
            method.getClass();
            this._builder.setMethods(i, method);
        }

        public final /* synthetic */ void setMixins(DslList dslList, int i, Mixin mixin) {
            dslList.getClass();
            mixin.getClass();
            this._builder.setMixins(i, mixin);
        }

        public final void setName(String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            dslList.getClass();
            option.getClass();
            this._builder.setOptions(i, option);
        }

        public final void setSourceContext(SourceContext sourceContext) {
            sourceContext.getClass();
            this._builder.setSourceContext(sourceContext);
        }

        public final void setSyntax(Syntax syntax) {
            syntax.getClass();
            this._builder.setSyntax(syntax);
        }

        public final void setSyntaxValue(int i) {
            this._builder.setSyntaxValue(i);
        }

        public final void setVersion(String str) {
            str.getClass();
            this._builder.setVersion(str);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/ApiKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/ApiKt$Dsl;", "builder", "Lcom/google/protobuf/Api$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Api.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Api.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
