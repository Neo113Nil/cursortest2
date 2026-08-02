package com.bugsnag.android;

import com.bugsnag.android.JsonStream;

/* loaded from: classes.dex */
public final class Error implements JsonStream.Streamable {
    public final ErrorInternal impl;
    public final Logger logger;

    public Error(ErrorInternal errorInternal, Logger logger) {
        this.impl = errorInternal;
        this.logger = logger;
    }

    public final void setErrorClass(String str) {
        if (str != null) {
            this.impl.errorClass = str;
        } else {
            this.logger.e("Invalid null value supplied to error.errorClass, ignoring");
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        this.impl.toStream(jsonStream);
    }
}
