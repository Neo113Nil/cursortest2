package com.squareup.cash.db;

import app.cash.sqldelight.SimpleExecutableQuery;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class SessionQueries extends TransacterImpl {
    public SimpleExecutableQuery changes() {
        SessionQueries$$ExternalSyntheticLambda1 sessionQueries$$ExternalSyntheticLambda1 = new SessionQueries$$ExternalSyntheticLambda1(23, false);
        SqlDriver sqlDriver = this.driver;
        sqlDriver.getClass();
        return new SimpleExecutableQuery(-1740487646, sqlDriver, "Database.sq", "changes", "SELECT changes()", sessionQueries$$ExternalSyntheticLambda1);
    }

    public QueryResult deleteAll() {
        QueryResult execute = this.driver.execute(1068792104, "DELETE FROM activeRewardOverride", null);
        notifyQueries(1068792104, new SvgDecoder$$ExternalSyntheticLambda0(29));
        return execute;
    }

    public QueryResult setActiveLink(Long l) {
        QueryResult execute = this.driver.execute(-1334847831, "INSERT OR REPLACE INTO active_storage_link\n-- There is only one (or zero, at startup) active link at any given time, so\n-- the primary key ID of 1 is hardcoded here.\nVALUES (1, ?)", new StorageLinkQueries$$ExternalSyntheticLambda9(0, l));
        notifyQueries(-1334847831, new SessionQueries$$ExternalSyntheticLambda1(7, false));
        return execute;
    }
}
