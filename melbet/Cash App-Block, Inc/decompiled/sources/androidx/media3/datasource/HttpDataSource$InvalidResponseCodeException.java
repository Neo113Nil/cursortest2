package androidx.media3.datasource;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final int responseCode;

    public HttpDataSource$InvalidResponseCodeException(int i, DataSourceException dataSourceException, Map map) {
        super(2004, dataSourceException, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Response code: "));
        this.responseCode = i;
    }
}
