package org.webrtc.video;

import com.cloudwebrtc.webrtc.SimulcastVideoEncoderFactoryWrapper;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.SoftwareVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;

/* loaded from: classes4.dex */
public class CustomVideoEncoderFactory implements VideoEncoderFactory {
    private SimulcastVideoEncoderFactoryWrapper simulcastVideoEncoderFactoryWrapper;
    private SoftwareVideoEncoderFactory softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
    private boolean forceSWCodec = false;
    private List<String> forceSWCodecs = new ArrayList();

    public CustomVideoEncoderFactory(EglBase.Context context, boolean z, boolean z2) {
        this.simulcastVideoEncoderFactoryWrapper = new SimulcastVideoEncoderFactoryWrapper(context, z, z2);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return this.forceSWCodec ? this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo) : (this.forceSWCodecs.isEmpty() || !this.forceSWCodecs.contains(videoCodecInfo.name)) ? this.simulcastVideoEncoderFactoryWrapper.createEncoder(videoCodecInfo) : this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (this.forceSWCodec && this.forceSWCodecs.isEmpty()) ? this.softwareVideoEncoderFactory.getSupportedCodecs() : this.simulcastVideoEncoderFactoryWrapper.getSupportedCodecs();
    }

    public void setForceSWCodec(boolean z) {
        this.forceSWCodec = z;
    }

    public void setForceSWCodecList(List<String> list) {
        this.forceSWCodecs = list;
    }
}
