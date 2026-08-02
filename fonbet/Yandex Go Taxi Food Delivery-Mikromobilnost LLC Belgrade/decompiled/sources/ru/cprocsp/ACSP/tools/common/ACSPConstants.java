package ru.cprocsp.ACSP.tools.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* loaded from: classes4.dex */
public interface ACSPConstants {
    public static final int ActionTypeAdd = 1;
    public static final int ActionTypeEdit = 2;
    public static final int ActionTypeNone = 0;
    public static final DateFormat DATE_FORMAT;
    public static final DateFormat DATE_FORMAT_CERT;
    public static final DateFormat DATE_FORMAT_CERT_ITEM;
    public static final String INTENT_EXTRA_OUT_ACTION = "action";
    public static final String STATUS = "status";
    public static final String STATUS_DETAILED_ERROR_CODE = "detailed_error_code";
    public static final String STATUS_DETAILED_ERROR_MESSAGE_ID = "detailed_error_message_id";
    public static final String STATUS_SELECTED_SERVER_INFO = "selected_server_info";
    public static final String STATUS_SENDER = "status_sender";
    public static final String STATUS_TRAFFIC_METER = "traffic_meter";
    public static final DateFormat TIME_FORMAT;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        DATE_FORMAT = simpleDateFormat;
        DATE_FORMAT_CERT = simpleDateFormat;
        TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
        DATE_FORMAT_CERT_ITEM = new SimpleDateFormat("dd.MM.yyyy");
    }
}
