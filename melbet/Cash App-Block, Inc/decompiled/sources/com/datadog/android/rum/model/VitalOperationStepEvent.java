package com.datadog.android.rum.model;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class VitalOperationStepEvent {

    public final class Context {
        public final LinkedHashMap additionalProperties;

        public Context(LinkedHashMap linkedHashMap) {
            this.additionalProperties = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Context) && this.additionalProperties.equals(((Context) obj).additionalProperties);
        }

        public final int hashCode() {
            return this.additionalProperties.hashCode();
        }

        public final String toString() {
            return "Context(additionalProperties=" + this.additionalProperties + ")";
        }
    }

    public enum Interface {
        /* JADX INFO: Fake field, exist only in values array */
        BLUETOOTH("bluetooth"),
        /* JADX INFO: Fake field, exist only in values array */
        CELLULAR("cellular"),
        /* JADX INFO: Fake field, exist only in values array */
        ETHERNET("ethernet"),
        /* JADX INFO: Fake field, exist only in values array */
        WIFI("wifi"),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX("wimax"),
        /* JADX INFO: Fake field, exist only in values array */
        MIXED("mixed"),
        /* JADX INFO: Fake field, exist only in values array */
        OTHER("other"),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN("unknown"),
        /* JADX INFO: Fake field, exist only in values array */
        NONE("none");

        public final String jsonValue;

        Interface(String str) {
            this.jsonValue = str;
        }
    }

    public final class Usr {
        public static final String[] RESERVED_PROPERTIES = {"id", "name", "email", "anonymous_id"};
        public final Map additionalProperties;
        public final String anonymousId;
        public final String email;
        public final String id;
        public final String name;

        public Usr(String str, String str2, String str3, String str4, Map map) {
            this.id = str;
            this.name = str2;
            this.email = str3;
            this.anonymousId = str4;
            this.additionalProperties = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Usr)) {
                return false;
            }
            Usr usr = (Usr) obj;
            return Intrinsics.areEqual(this.id, usr.id) && Intrinsics.areEqual(this.name, usr.name) && Intrinsics.areEqual(this.email, usr.email) && Intrinsics.areEqual(this.anonymousId, usr.anonymousId) && this.additionalProperties.equals(usr.additionalProperties);
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.email;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.anonymousId;
            return this.additionalProperties.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Usr(id=", this.id, ", name=", this.name, ", email=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.email, ", anonymousId=", this.anonymousId, ", additionalProperties=");
            return re$$ExternalSyntheticOutline0.m(")", m, this.additionalProperties);
        }
    }
}
