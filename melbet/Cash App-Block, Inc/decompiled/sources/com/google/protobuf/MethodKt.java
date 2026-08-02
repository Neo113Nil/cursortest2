package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/MethodKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MethodKt {
    public static final MethodKt INSTANCE = new MethodKt();

    private MethodKt() {
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u001c\n\u0002\b\f\b\u0007\u0018\u0000 D2\u00020\u0001:\u0002DEB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010-\u001a\u00020.H\u0001J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\u0006\u00102\u001a\u000200J\u0006\u00103\u001a\u000200J\u0006\u00104\u001a\u000200J\u0006\u00105\u001a\u000200J%\u00106\u001a\u000200*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0002\b7J+\u00108\u001a\u000200*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0:H\u0007¢\u0006\u0002\b;J\u001d\u0010<\u001a\u000200*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0002\b=J&\u0010>\u001a\u000200*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0005\u001a\u00020\u000eH\u0087\n¢\u0006\u0002\b?J,\u0010>\u001a\u000200*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0:H\u0087\n¢\u0006\u0002\b@J.\u0010A\u001a\u000200*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010B\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u000eH\u0087\u0002¢\u0006\u0002\bCR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R$\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006F"}, d2 = {"Lcom/google/protobuf/MethodKt$Dsl;", "", "_builder", "Lcom/google/protobuf/Method$Builder;", "(Lcom/google/protobuf/Method$Builder;)V", "value", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "options", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/MethodKt$Dsl$OptionsProxy;", "getOptions", "()Lcom/google/protobuf/kotlin/DslList;", "", "requestStreaming", "getRequestStreaming", "()Z", "setRequestStreaming", "(Z)V", "requestTypeUrl", "getRequestTypeUrl", "setRequestTypeUrl", "responseStreaming", "getResponseStreaming", "setResponseStreaming", "responseTypeUrl", "getResponseTypeUrl", "setResponseTypeUrl", "Lcom/google/protobuf/Syntax;", "syntax", "getSyntax", "()Lcom/google/protobuf/Syntax;", "setSyntax", "(Lcom/google/protobuf/Syntax;)V", "", "syntaxValue", "getSyntaxValue", "()I", "setSyntaxValue", "(I)V", "_build", "Lcom/google/protobuf/Method;", "clearName", "", "clearRequestStreaming", "clearRequestTypeUrl", "clearResponseStreaming", "clearResponseTypeUrl", "clearSyntax", "add", "addOptions", "addAll", "values", "", "addAllOptions", "clear", "clearOptions", "plusAssign", "plusAssignOptions", "plusAssignAllOptions", "set", "index", "setOptions", "Companion", "OptionsProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Method.Builder _builder;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/MethodKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Method.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Method _build() {
            Method build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            dslList.getClass();
            option.getClass();
            this._builder.addOptions(option);
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            dslList.getClass();
            this._builder.clearOptions();
        }

        public final void clearRequestStreaming() {
            this._builder.clearRequestStreaming();
        }

        public final void clearRequestTypeUrl() {
            this._builder.clearRequestTypeUrl();
        }

        public final void clearResponseStreaming() {
            this._builder.clearResponseStreaming();
        }

        public final void clearResponseTypeUrl() {
            this._builder.clearResponseTypeUrl();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
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

        public final boolean getRequestStreaming() {
            return this._builder.getRequestStreaming();
        }

        public final String getRequestTypeUrl() {
            String requestTypeUrl = this._builder.getRequestTypeUrl();
            requestTypeUrl.getClass();
            return requestTypeUrl;
        }

        public final boolean getResponseStreaming() {
            return this._builder.getResponseStreaming();
        }

        public final String getResponseTypeUrl() {
            String responseTypeUrl = this._builder.getResponseTypeUrl();
            responseTypeUrl.getClass();
            return responseTypeUrl;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            syntax.getClass();
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            dslList.getClass();
            option.getClass();
            addOptions(dslList, option);
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

        public final void setRequestStreaming(boolean z) {
            this._builder.setRequestStreaming(z);
        }

        public final void setRequestTypeUrl(String str) {
            str.getClass();
            this._builder.setRequestTypeUrl(str);
        }

        public final void setResponseStreaming(boolean z) {
            this._builder.setResponseStreaming(z);
        }

        public final void setResponseTypeUrl(String str) {
            str.getClass();
            this._builder.setResponseTypeUrl(str);
        }

        public final void setSyntax(Syntax syntax) {
            syntax.getClass();
            this._builder.setSyntax(syntax);
        }

        public final void setSyntaxValue(int i) {
            this._builder.setSyntaxValue(i);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/MethodKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/MethodKt$Dsl;", "builder", "Lcom/google/protobuf/Method$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Method.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Method.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
