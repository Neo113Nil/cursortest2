package com.adjust.sdk;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class AdjustStoreInfo {
    private static final ILogger logger = AdjustFactory.getLogger();
    String storeAppId;
    String storeName;

    public AdjustStoreInfo(String str) {
        if (isValidStore(str)) {
            this.storeName = str;
        }
    }

    private boolean isValidStore(String str) {
        if (str == null) {
            logger.error("Missing store name", new Object[0]);
            return false;
        }
        if (!str.isEmpty()) {
            return true;
        }
        logger.error("Store name can't be empty", new Object[0]);
        return false;
    }

    public void setStoreAppId(String str) {
        this.storeAppId = str;
    }
}
