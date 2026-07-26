package android.content.Context;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLocationManagerAlphaNovaMax2065 extends FrostHunterKeyEventSolarVortex1388 {
    public InetAddress FrostHunterCameraXTurboCelestialHero5430;
    public DatagramSocket FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final int FrostHunterFragmentBetaMegaVortex6025;
    public final DatagramPacket FrostHunterLightSensorForceFusion4241;
    public MulticastSocket FrostHunterLintTitanVortexQuantum9911;
    public boolean FrostHunterResourcesTitanHyperVision5823;
    public Uri FrostHunterScaleAnimationStrikeSpark5059;
    public final byte[] FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public int FrostHunterTextViewDragonStormMega4297;

    public FrostHunterLocationManagerAlphaNovaMax2065() {
        super(true);
        this.FrostHunterFragmentBetaMegaVortex6025 = 8000;
        byte[] bArr = new byte[2000];
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = bArr;
        this.FrostHunterLightSensorForceFusion4241 = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final long FrostHunterKeyframeGammaGamma1197(FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903) {
        Uri uri = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterScaleAnimationStrikeSpark5059 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.FrostHunterScaleAnimationStrikeSpark5059.getPort();
        FrostHunterFragmentBetaMegaVortex6025();
        try {
            this.FrostHunterCameraXTurboCelestialHero5430 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.FrostHunterCameraXTurboCelestialHero5430, port);
            if (this.FrostHunterCameraXTurboCelestialHero5430.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.FrostHunterLintTitanVortexQuantum9911 = multicastSocket;
                multicastSocket.joinGroup(this.FrostHunterCameraXTurboCelestialHero5430);
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = this.FrostHunterLintTitanVortexQuantum9911;
            } else {
                this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new DatagramSocket(inetSocketAddress);
            }
            this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.setSoTimeout(this.FrostHunterFragmentBetaMegaVortex6025);
            this.FrostHunterResourcesTitanHyperVision5823 = true;
            FrostHunterResourcesTitanHyperVision5823(frostHunterStateListAnimatorQuantumHyperionTitanium1903);
            return -1L;
        } catch (IOException e) {
            throw new FrostHunterServiceEpicOmega5739(e, 2001);
        } catch (SecurityException e2) {
            throw new FrostHunterServiceEpicOmega5739(e2, 2006);
        }
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final Uri FrostHunterLightSensorForceFusion4241() {
        return this.FrostHunterScaleAnimationStrikeSpark5059;
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final void close() {
        this.FrostHunterScaleAnimationStrikeSpark5059 = null;
        MulticastSocket multicastSocket = this.FrostHunterLintTitanVortexQuantum9911;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.FrostHunterCameraXTurboCelestialHero5430;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.FrostHunterLintTitanVortexQuantum9911 = null;
        }
        DatagramSocket datagramSocket = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = null;
        }
        this.FrostHunterCameraXTurboCelestialHero5430 = null;
        this.FrostHunterTextViewDragonStormMega4297 = 0;
        if (this.FrostHunterResourcesTitanHyperVision5823) {
            this.FrostHunterResourcesTitanHyperVision5823 = false;
            FrostHunterRemoteConfigSpeedSpeed8566();
        }
    }

    @Override // android.content.Context.FrostHunterRoomDaoMaxPrimeQuantum2063
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.FrostHunterTextViewDragonStormMega4297;
        DatagramPacket datagramPacket = this.FrostHunterLightSensorForceFusion4241;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.FrostHunterTextViewDragonStormMega4297 = length;
                FrostHunterBundlePulseFusionHero2475(length);
            } catch (SocketTimeoutException e) {
                throw new FrostHunterServiceEpicOmega5739(e, 2002);
            } catch (IOException e2) {
                throw new FrostHunterServiceEpicOmega5739(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.FrostHunterTextViewDragonStormMega4297;
        int min = Math.min(i4, i2);
        System.arraycopy(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, length2 - i4, bArr, i, min);
        this.FrostHunterTextViewDragonStormMega4297 -= min;
        return min;
    }
}
