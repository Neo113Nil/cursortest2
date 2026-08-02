package com.fidesmo.sec.delivery.models;

import com.fidesmo.sec.core.models.ParametrisedTranslation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/fidesmo/sec/delivery/models/UiAction;", "", "description", "Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "name", "", "parameters", "", "(Lcom/fidesmo/sec/core/models/ParametrisedTranslation;Ljava/lang/String;Ljava/util/Map;)V", "getDescription", "()Lcom/fidesmo/sec/core/models/ParametrisedTranslation;", "getName", "()Ljava/lang/String;", "getParameters", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UiAction {
    private final ParametrisedTranslation description;
    private final String name;
    private final Map<String, String> parameters;

    public UiAction(ParametrisedTranslation parametrisedTranslation, String str, Map<String, String> map) {
        parametrisedTranslation.getClass();
        str.getClass();
        map.getClass();
        this.description = parametrisedTranslation;
        this.name = str;
        this.parameters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiAction copy$default(UiAction uiAction, ParametrisedTranslation parametrisedTranslation, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            parametrisedTranslation = uiAction.description;
        }
        if ((i & 2) != 0) {
            str = uiAction.name;
        }
        if ((i & 4) != 0) {
            map = uiAction.parameters;
        }
        return uiAction.copy(parametrisedTranslation, str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final ParametrisedTranslation getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, String> component3() {
        return this.parameters;
    }

    public final UiAction copy(ParametrisedTranslation description, String name, Map<String, String> parameters) {
        description.getClass();
        name.getClass();
        parameters.getClass();
        return new UiAction(description, name, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiAction)) {
            return false;
        }
        UiAction uiAction = (UiAction) other;
        return Intrinsics.areEqual(this.description, uiAction.description) && Intrinsics.areEqual(this.name, uiAction.name) && Intrinsics.areEqual(this.parameters, uiAction.parameters);
    }

    public final ParametrisedTranslation getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return this.parameters.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.description.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        return "UiAction(description=" + this.description + ", name=" + this.name + ", parameters=" + this.parameters + ')';
    }
}
