package com.squareup.cash.education.stories.service.real;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/squareup/cash/education/stories/service/real/IsoDateTimeAdapter;", "", "Ljava/time/Instant;", "instant", "", "toJson", "(Ljava/time/Instant;)Ljava/lang/String;", InquiryField.DatetimeField.TYPE, "fromJson", "(Ljava/lang/String;)Ljava/time/Instant;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IsoDateTimeAdapter {
    public final DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

    @FromJson
    public final Instant fromJson(String datetime) {
        datetime.getClass();
        Instant instant = ZonedDateTime.parse(datetime, this.formatter).toInstant();
        instant.getClass();
        return instant;
    }

    @ToJson
    public final String toJson(Instant instant) {
        instant.getClass();
        String format2 = this.formatter.format(instant);
        format2.getClass();
        return format2;
    }
}
