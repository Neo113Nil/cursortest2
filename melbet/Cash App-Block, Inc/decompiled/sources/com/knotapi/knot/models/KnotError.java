package com.knotapi.knot.models;

/* loaded from: classes6.dex */
public enum KnotError {
    INVALID_SESSION("Invalid_Session", "The session is invalid."),
    EXPIRED_SESSION("Expired_Session", "The session has expired."),
    INVALID_CLIENT_ID("Invalid_Client_Id", "The client ID is invalid."),
    INTERNAL_ERROR("Internal_Error", "An internal error occurred."),
    INVALID_CARD_NAME("Invalid_Card_Name", "The card name is invalid."),
    INVALID_CUSTOMER_NAME("Invalid_Customer_Name", "The customer name is invalid."),
    INVALID_LOGO_ID("Invalid_Logo_Id", "The logo ID is invalid."),
    MERCHANT_ID_NOT_FOUND("Merchant_Id_Not_Found", "The merchant ID is required.");

    private final String errorCode;
    private final String errorDescription;

    KnotError(String str, String str2) {
        this.errorCode = str;
        this.errorDescription = str2;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDescription() {
        return this.errorDescription;
    }
}
