package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public final class set3DSServerTransactionID {

    public static final class ThreeDS2Service<T> implements setAcsTransactionID<T> {
        private final nd<T> initialize;

        public ThreeDS2Service(final setAcsTransactionID<T> setacstransactionid) {
            this.initialize = new nd<T>() { // from class: com.netcetera.threeds.sdk.infrastructure.set3DSServerTransactionID.ThreeDS2Service.2
                @Override // com.netcetera.threeds.sdk.infrastructure.nd
                public T initialize() {
                    return (T) setacstransactionid.ThreeDS2ServiceInstance();
                }
            };
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
        public T ThreeDS2ServiceInstance() {
            return this.initialize.ThreeDS2ServiceInstance();
        }
    }

    public static <T> setAcsTransactionID<T> ThreeDS2ServiceInstance(setAcsTransactionID<T> setacstransactionid) {
        return new ThreeDS2Service(setacstransactionid);
    }
}
