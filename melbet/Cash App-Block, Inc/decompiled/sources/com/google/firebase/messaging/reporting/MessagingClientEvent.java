package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;

/* loaded from: classes4.dex */
public final class MessagingClientEvent {
    public final String analytics_label_;
    public final String collapse_key_;
    public final String composer_label_;
    public final Event event_;
    public final String instance_id_;
    public final String message_id_;
    public final MessageType message_type_;
    public final String package_name_;
    public final int priority_;
    public final long project_number_;
    public final SDKPlatform sdk_platform_;
    public final String topic_;
    public final int ttl_;

    public final class Builder {
        public String analytics_label_;
        public String collapse_key_;
        public String composer_label_;
        public Event event_;
        public String instance_id_;
        public String message_id_;
        public MessageType message_type_;
        public String package_name_;
        public int priority_;
        public long project_number_;
        public SDKPlatform sdk_platform_;
        public String topic_;
        public int ttl_;

        public final MessagingClientEvent build() {
            return new MessagingClientEvent(this.project_number_, this.message_id_, this.instance_id_, this.message_type_, this.sdk_platform_, this.package_name_, this.collapse_key_, this.priority_, this.ttl_, this.topic_, this.event_, this.analytics_label_, this.composer_label_);
        }

        public final void setAnalyticsLabel(String str) {
            this.analytics_label_ = str;
        }

        public final void setCollapseKey(String str) {
            this.collapse_key_ = str;
        }

        public final void setComposerLabel(String str) {
            this.composer_label_ = str;
        }

        public final void setEvent() {
            this.event_ = Event.MESSAGE_DELIVERED;
        }

        public final void setInstanceId(String str) {
            this.instance_id_ = str;
        }

        public final void setMessageId(String str) {
            this.message_id_ = str;
        }

        public final void setMessageType(MessageType messageType) {
            this.message_type_ = messageType;
        }

        public final void setPackageName(String str) {
            this.package_name_ = str;
        }

        public final void setPriority(int i) {
            this.priority_ = i;
        }

        public final void setProjectNumber(long j) {
            this.project_number_ = j;
        }

        public final void setSdkPlatform() {
            this.sdk_platform_ = SDKPlatform.ANDROID;
        }

        public final void setTopic(String str) {
            this.topic_ = str;
        }

        public final void setTtl(int i) {
            this.ttl_ = i;
        }
    }

    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);

        public final int number_;

        Event(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        public final int number_;

        MessageType(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);

        public final int number_;

        SDKPlatform(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int getNumber() {
            return this.number_;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, Event event, String str6, String str7) {
        this.project_number_ = j;
        this.message_id_ = str;
        this.instance_id_ = str2;
        this.message_type_ = messageType;
        this.sdk_platform_ = sDKPlatform;
        this.package_name_ = str3;
        this.collapse_key_ = str4;
        this.priority_ = i;
        this.ttl_ = i2;
        this.topic_ = str5;
        this.event_ = event;
        this.analytics_label_ = str6;
        this.composer_label_ = str7;
    }

    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.project_number_ = 0L;
        builder.message_id_ = "";
        builder.instance_id_ = "";
        builder.message_type_ = MessageType.UNKNOWN;
        builder.sdk_platform_ = SDKPlatform.UNKNOWN_OS;
        builder.package_name_ = "";
        builder.collapse_key_ = "";
        builder.priority_ = 0;
        builder.ttl_ = 0;
        builder.topic_ = "";
        builder.event_ = Event.UNKNOWN_EVENT;
        builder.analytics_label_ = "";
        builder.composer_label_ = "";
        return builder;
    }
}
