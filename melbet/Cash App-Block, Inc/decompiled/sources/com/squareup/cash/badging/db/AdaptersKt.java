package com.squareup.cash.badging.db;

import app.cash.sqldelight.EnumColumnAdapter;
import com.google.mlkit.common.internal.zze;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.wire.GrpcMethod;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final GrpcMethod badgeAdapter = new GrpcMethod(new EnumColumnAdapter(ItemType.values()), new AsyncTimeout.Companion(), new AsyncTimeout.Companion());
    public static final zze badgeCountAdapter = new zze(13);
    public static final EnumListAdapter badgeGroupAdapter = new EnumListAdapter(new EnumColumnAdapter(ItemType.values()));
}
