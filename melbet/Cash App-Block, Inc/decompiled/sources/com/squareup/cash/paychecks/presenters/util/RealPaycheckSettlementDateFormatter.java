package com.squareup.cash.paychecks.presenters.util;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import com.squareup.cash.R;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes6.dex */
public final class RealPaycheckSettlementDateFormatter {
    public final AndroidClock clock;
    public final AndroidDateFormatManager dateFormatManager;
    public final Lazy formatter$delegate = LazyKt.lazy(new MoneyTabUIKt$$ExternalSyntheticLambda5(this, 22));
    public final AndroidStringManager stringManager;
    public final ZoneId zoneId;

    public RealPaycheckSettlementDateFormatter(AndroidClock androidClock, AndroidStringManager androidStringManager, AndroidDateFormatManager androidDateFormatManager) {
        this.clock = androidClock;
        this.stringManager = androidStringManager;
        this.dateFormatManager = androidDateFormatManager;
        this.zoneId = ZoneId.of(androidClock.timeZone().getID());
    }

    public final String format(PaychecksUiState.Paycheck.SettlementDate settlementDate) {
        settlementDate.getClass();
        Instant ofEpochMilli = Instant.ofEpochMilli(settlementDate.date);
        ZoneId zoneId = this.zoneId;
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(ofEpochMilli, zoneId);
        int ordinal = settlementDate.f1181type.ordinal();
        Lazy lazy = this.formatter$delegate;
        if (ordinal != 0) {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String format2 = ((DateTimeFormatter) lazy.getValue()).format(ofInstant);
            format2.getClass();
            return format2;
        }
        ofInstant.getClass();
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        ZonedDateTime ofInstant2 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(this.clock.millis()), zoneId);
        ofInstant2.getClass();
        ZonedDateTime of = ZonedDateTime.of(ofInstant2.toLocalDate(), LocalTime.MIDNIGHT, ofInstant2.getZone());
        of.getClass();
        if (ofInstant.isBefore(of.minusDays(1L))) {
            String format3 = ((DateTimeFormatter) lazy.getValue()).format(ofInstant);
            format3.getClass();
            resources.getClass();
            String format4 = new MessageFormat(resources.getString(R.string.paycheck_settlementdate_expected_date)).format(new Object[]{format3});
            format4.getClass();
            return format4;
        }
        if (ofInstant.isBefore(of)) {
            return androidStringManager.get(R.string.paycheck_settlementdate_expected_yesterday);
        }
        if (!ofInstant.isAfter(of.plusDays(2L))) {
            return ofInstant.isAfter(of.plusDays(1L)) ? androidStringManager.get(R.string.paycheck_settlementdate_expected_tomorrow) : androidStringManager.get(R.string.paycheck_settlementdate_expected_today);
        }
        String format5 = ((DateTimeFormatter) lazy.getValue()).format(ofInstant);
        format5.getClass();
        resources.getClass();
        String format6 = new MessageFormat(resources.getString(R.string.paycheck_settlementdate_expected_date)).format(new Object[]{format5});
        format6.getClass();
        return format6;
    }
}
