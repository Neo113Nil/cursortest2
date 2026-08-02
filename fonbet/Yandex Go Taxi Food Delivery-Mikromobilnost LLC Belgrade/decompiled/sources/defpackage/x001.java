package defpackage;

/* loaded from: classes10.dex */
public abstract class x001 {
    private ip4 bandwidthMeter;
    private w001 listener;

    public final ip4 getBandwidthMeter() {
        ip4 ip4Var = this.bandwidthMeter;
        d6z.z(ip4Var);
        return ip4Var;
    }

    public r001 getParameters() {
        return r001.v;
    }

    public hyi0 getRendererCapabilitiesListener() {
        return null;
    }

    public void init(w001 w001Var, ip4 ip4Var) {
        this.listener = w001Var;
        this.bandwidthMeter = ip4Var;
    }

    public final void invalidate() {
        w001 w001Var = this.listener;
        if (w001Var != null) {
            w001Var.onTrackSelectionsInvalidated();
        }
    }

    public final void invalidateForRendererCapabilitiesChange(fyi0 fyi0Var) {
        w001 w001Var = this.listener;
        if (w001Var != null) {
            w001Var.onRendererCapabilitiesChanged(fyi0Var);
        }
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(Object obj);

    public void release() {
        this.listener = null;
        this.bandwidthMeter = null;
    }

    public abstract y001 selectTracks(iyi0[] iyi0VarArr, yzz0 yzz0Var, sf10 sf10Var, a9z0 a9z0Var);

    public void setAudioAttributes(ue3 ue3Var) {
    }

    public void setParameters(r001 r001Var) {
    }
}
