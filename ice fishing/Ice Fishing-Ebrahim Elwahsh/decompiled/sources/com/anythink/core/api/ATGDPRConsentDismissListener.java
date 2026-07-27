package com.anythink.core.api;

import D.y;

/* loaded from: classes.dex */
public interface ATGDPRConsentDismissListener {

    public static class ConsentDismissInfo {
        private int dismissType;
        private String infoMsg;

        public ConsentDismissInfo(String str, int i) {
            this.infoMsg = str;
            this.dismissType = i;
        }

        public int getDismissType() {
            return this.dismissType;
        }

        public String getInfoMsg() {
            return this.infoMsg;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ConsentDismissInfo{infoMsg='");
            sb.append(this.infoMsg);
            sb.append("', dismissType=");
            return y.m(sb, this.dismissType, '}');
        }
    }

    void onDismiss(ConsentDismissInfo consentDismissInfo);
}
