package yads;

import defpackage.yv81;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class ot3 extends zt3 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;

    public ot3(yv81 yv81Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(yv81Var);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
