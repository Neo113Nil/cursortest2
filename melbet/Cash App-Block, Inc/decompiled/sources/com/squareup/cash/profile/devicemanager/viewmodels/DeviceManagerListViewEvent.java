package com.squareup.cash.profile.devicemanager.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface DeviceManagerListViewEvent {

    public final class DeviceSelected implements DeviceManagerListViewEvent {
        public final String token;

        public DeviceSelected(String str) {
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceSelected) && this.token.equals(((DeviceSelected) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceSelected(token=", this.token, ")");
        }
    }

    /* loaded from: classes6.dex */
    public final class GoBack implements DeviceManagerListViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -353811636;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* loaded from: classes6.dex */
    public final class RefreshDevices implements DeviceManagerListViewEvent {
        public static final RefreshDevices INSTANCE = new RefreshDevices();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RefreshDevices);
        }

        public final int hashCode() {
            return -1187145249;
        }

        public final String toString() {
            return "RefreshDevices";
        }
    }

    /* loaded from: classes6.dex */
    public final class RemoveAllCancelled implements DeviceManagerListViewEvent {
        public static final RemoveAllCancelled INSTANCE = new RemoveAllCancelled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveAllCancelled);
        }

        public final int hashCode() {
            return -1678440143;
        }

        public final String toString() {
            return "RemoveAllCancelled";
        }
    }

    /* loaded from: classes6.dex */
    public final class RemoveAllConfirmed implements DeviceManagerListViewEvent {
        public static final RemoveAllConfirmed INSTANCE = new RemoveAllConfirmed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveAllConfirmed);
        }

        public final int hashCode() {
            return 1335829311;
        }

        public final String toString() {
            return "RemoveAllConfirmed";
        }
    }

    /* loaded from: classes6.dex */
    public final class RequestRemoveAll implements DeviceManagerListViewEvent {
        public static final RequestRemoveAll INSTANCE = new RequestRemoveAll();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestRemoveAll);
        }

        public final int hashCode() {
            return -1632712245;
        }

        public final String toString() {
            return "RequestRemoveAll";
        }
    }
}
