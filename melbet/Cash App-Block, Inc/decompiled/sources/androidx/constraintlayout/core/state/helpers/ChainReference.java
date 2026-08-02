package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.compose.State;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State$Chain;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class ChainReference extends HelperReference {
    public float mBias;
    public HashMap mMapPostGoneMargin;
    public final HashMap mMapPostMargin;
    public HashMap mMapPreGoneMargin;
    public final HashMap mMapPreMargin;
    public final HashMap mMapWeights;
    public State$Chain mStyle;

    public ChainReference(State state, int i) {
        super(state, i);
        this.mBias = 0.5f;
        this.mMapWeights = new HashMap();
        this.mMapPreMargin = new HashMap();
        this.mMapPostMargin = new HashMap();
        this.mStyle = State$Chain.SPREAD;
    }

    public final float getPostGoneMargin(String str) {
        HashMap hashMap = this.mMapPostGoneMargin;
        return (hashMap == null || !hashMap.containsKey(str)) ? RecyclerView.DECELERATION_RATE : ((Float) this.mMapPostGoneMargin.get(str)).floatValue();
    }

    public final float getPostMargin(String str) {
        HashMap hashMap = this.mMapPostMargin;
        return hashMap.containsKey(str) ? ((Float) hashMap.get(str)).floatValue() : RecyclerView.DECELERATION_RATE;
    }

    public final float getPreGoneMargin(String str) {
        HashMap hashMap = this.mMapPreGoneMargin;
        return (hashMap == null || !hashMap.containsKey(str)) ? RecyclerView.DECELERATION_RATE : ((Float) this.mMapPreGoneMargin.get(str)).floatValue();
    }

    public final float getPreMargin(String str) {
        HashMap hashMap = this.mMapPreMargin;
        return hashMap.containsKey(str) ? ((Float) hashMap.get(str)).floatValue() : RecyclerView.DECELERATION_RATE;
    }
}
